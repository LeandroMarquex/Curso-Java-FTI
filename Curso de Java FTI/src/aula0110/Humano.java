package aula0110;

public class Humano implements IPersonagem, INegociavel {

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		System.out.println("Humano andando");
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println("Humano ATACAR");
	}

	@Override
	public boolean trocar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void comprar(Double valorItem) {
		// TODO Auto-generated method stub
		
	}
	
	

}
