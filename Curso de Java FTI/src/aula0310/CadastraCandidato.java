package aula0310;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CadastraCandidato {
	
	public static void main(String[] args) {
		Candidato c = new Candidato();
		Scanner s = new Scanner(System.in);
		imprimir("Informe o Nome");
		c.setNome(s.nextLine());
/*		imprimir("Informe o CPF");
		c.setCpf(s.nextLine());
		imprimir("Informe o RG");
		c.setRg(s.nextLine());
		imprimir("Informe a Data de Nascimento (dd/mm/yyyy)");
		c.setDataNascimentoString(s.nextLine());
		imprimir("Informe o Telefone 1");
		c.setTelefone1(s.nextLine());
		imprimir("Informe o Telefone 2");
		c.setTelefone2(s.nextLine());
		imprimir("Informe o Email");
		c.setEmail(s.nextLine());*/
		
		//conversao data
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		CandidatoServico.gravar(c);
	}

	private static void imprimir(String texto) {
		System.out.println(texto + ": ");
	}
}
