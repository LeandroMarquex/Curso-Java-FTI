package aula0410;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestaColetores {

	public static void main(String[] args) {
		// List
		List<String> nomes = new ArrayList<>();
		// para cada (tipo) que eu vou chamar de (nome variavel)
		// dentro da lista (nomeDaLista) faça
		for (String nome : nomes) {
			// somente exemplo: int index = nomes.indexOff(nome)
			System.out.println(nome);

			// inserir item no arrayList
			nomes.add(1, "Leandro");
			nomes.add("Marques");
		}

		List<String> alunosQueChegaramAntes = new ArrayList<>();
		alunosQueChegaramAntes.add("Lidia");
		alunosQueChegaramAntes.add("Marluã");
		alunosQueChegaramAntes.add("Lura");

		List<String> alunosQueChegaramDepois = new ArrayList<>();
		alunosQueChegaramDepois.add("Lidia2");
		alunosQueChegaramDepois.add("Marluã2");
		alunosQueChegaramDepois.add("Lura2");

		alunosQueChegaramAntes.addAll(alunosQueChegaramDepois);

		for (String ttt : alunosQueChegaramAntes) {
			System.out.println(ttt);
			
			
			System.out.println("********************************************");

			for (int i = 0; i < nomes.size(); i++) {
				String nome = nomes.get(i);
			}

			String nomes2[] = new String[10];
			for (int i = 0; i < nomes2.length; i++) {
				String nome = nomes2[i];
			}
			Collections.sort(nomes);

			// set não contem elementos duplicados
			Set<String> times = new HashSet<>();
			times.add("Londrina");
			times.add("Santos");
			times.add("Corinthians");
			times.add("LEC");
			times.add("Londrina");

			for (String t : times) {
				System.out.println(t);

			}

		}
		//id, string
		Map<Integer, String> partidos = new HashMap<>();
		
		partidos.put(777,"PP");
		partidos.put(778,"PA");
		partidos.put(779,"PB");
		partidos.put(776,"PC");
		partidos.put(775,"PH");
		partidos.put(777,"PN");
		
		Set<Integer> chaves = partidos.keySet();
		for (Integer integer : chaves) {
			System.out.println(partidos.get(integer));
			System.out.println("Numero partido " + integer + " PARTIDO " + partidos.get(integer));
			
		}
		Map<String, List<Integer>> notasPorAluno = new HashMap<>();
		notasPorAluno.put("José", Arrays.asList(10, 10, 10));
		notasPorAluno.put("Lidia", Arrays.asList(10, 9, 8));
		notasPorAluno.put("Caio", Arrays.asList(7, 6, 6));
		
		//
		
	}

}
