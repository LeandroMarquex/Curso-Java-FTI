package aula0310;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CandidatoServico {
	
	//gravar
	public static void gravar(Candidato candidato) {
		try {
			candidato.validarPreenchimento();
			File file = new File("E:\\FTI\\Testa arquivo\\teste.txt");
			
			FileWriter fw = null;
			
			
			
			try {
				
				fw = new FileWriter(file);
				fw.write("candidato");
				fw.close();
				
					
			
				
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
		} catch (ValidacaoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//recuperar
	public void ler() {
		
	}

}