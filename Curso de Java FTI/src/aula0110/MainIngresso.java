package aula0110;

import java.util.Scanner;

public class MainIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		escolherIngresso();

	}
	
	public static void escolherIngresso() {

		System.out.println("----------------------------------");
		System.out.println("           INGRESSOS            ");
		System.out.println("----------------------------------");
		System.out.println(" [1] Ingresso NORMAL ");
		System.out.println(" [2] Ingresso VIP ");
		System.out.println(" [10] para SAIR ");
		System.out.println("----------------------------------");

		System.out.println(" Escolha no MENU ");
		
		Scanner entrada = new Scanner(System.in);
				
		int controle = entrada.nextInt();
//		controle = entrada.nextLine();

		switch (controle) {
		case 1:

			System.out.println("Faça seu pedido");
			
			escolherIngresso();

			break;
		case 2:
			System.out.println("O Sabor é");
			escolherIngresso();
			
			break;
		
		
		default:

			System.out.println(" Saindo do Menu ");

			break;
		}
	}
}
