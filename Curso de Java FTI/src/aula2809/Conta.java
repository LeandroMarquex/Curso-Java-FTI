package aula2809;

public class Conta {
	
	private String titular;
	private Double saldo = new Double(0);
	
	public Conta() {
		
	}
	
	public Conta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor) {
		if (valor != null && valor > 0) {
			saldo = saldo + valor;
			System.out.println("Deposito na conta alterado");
		}
	}
	
	public void sacar(Double valor) {
		if (valor != null && valor <= saldo) { 
			saldo = saldo - valor;
			System.out.println("Saque da conta");
		}
	}

	@Override
	public boolean equals(Object obj) {
		Conta other = (Conta) obj;
		if (saldo == null) {
			if (other.saldo != null) {
				return false;
			}
		} else if (!saldo.equals(other.saldo)) {
			return false;
		}
		return true;
	}
	

}
