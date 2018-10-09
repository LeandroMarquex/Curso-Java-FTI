package aula0510;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Gravar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("E:\\FTI\\Testa arquivo\\testeGravar.txt");
		
		FileWriter fw = null;
		
		
		
		try {
			
			fw = new FileWriter(file);
			fw.write("Frase � uma sequ�ncia de palavras que \r  constitui um enunciado de sentido completo. O in�cio e o fim da frase \r s�o marcados, na fala, por uma entona��o caracter�stica e, na escrita, \r por uma pontua��o espec�fica: a frase come�a com letra mai�scula e \rtermina em um ponto. Exemplo:Ameixa � uma fruta deliciosa.");
			fw.close();
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			
			String s = bf.readLine();
			while (s != null) {
				System.out.println(s);
				s = bf.readLine();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
