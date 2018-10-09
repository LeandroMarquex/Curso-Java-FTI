package aula0110;

public class Ingresso {

	private Double valor;
	
	public void imprimiValor(Double valor){
		valor = this.valor + valor;
		System.out.println("Valor do Ingresso: " + valor);
		
	}
}
