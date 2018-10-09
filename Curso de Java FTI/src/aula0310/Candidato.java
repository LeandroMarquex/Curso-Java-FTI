package aula0310;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import heranca.pessoa.Pessoa;

public class Candidato extends Pessoa {

	private EPartidoPolitico partido;
	private Integer numeroEleitoral;
	private String dataNascimentoString;

	public void validarPreenchimento() throws ValidacaoException {
		StringBuilder validacao = new StringBuilder();

		if (!validarString(nome)) {
			validacao.append("Campo nome obrigat�rio.\n");
		} else if (nome.split(" ").length < 2) {
			validacao.append("O nome deve ser completo.\n");
		}
	}
	/*
	 * if (!validarString(cpf)) {
	 * validacao.append("Campo CPF � obrigat�rio.\n"); } else if (cpf.length()
	 * != 11) { validacao.append("O CPF informado � inv�lido.\n"); }
	 * 
	 * if (validacao.length() > 0) { throw new
	 * ValidacaoException(validacao.toString()); } if
	 * (!validarString(dataNascimentoString)){
	 * validacao.append("Campo Data Nascimento � obrigat�rio.\n"); } else {
	 * String[] dataArray = dataNascimentoString.split("/"); if
	 * (dataArray.length != 3) {
	 * validacao.append("Informe a Data Nascimento no formato dd/mm/aaaa.\n"); }
	 * else { // convers�o data DateFormat formatter = new
	 * SimpleDateFormat("dd/MM/yyyy"); try { Date date =
	 * formatter.parse(dataNascimentoString); } catch (ParseException e) { //
	 * TODO: handle exception
	 * validacao.append("A Data Nascimento informada � inv�lida. \n");
	 * 
	 * } } } }
	 */

	private boolean validarString(String s) {
		return s != null && !s.isEmpty();
	}

	public void setDataNascimentoString(String dataNascimentoString) {
		this.dataNascimentoString = dataNascimentoString;
	}
}
