package aula0110;

public class MainInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPersonagem personagem = new Humano();
		personagem.andar();
		personagem.atacar();
		
		personagem =  new Elfe();
		personagem.andar();
		personagem.atacar();
		
//		var nome = "samara";
		

	}

}
