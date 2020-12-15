package gerenciador.br.com.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
	public static void main(String[] args) {
		Aula aula1 = new Aula("Aula 1", 30);
		Aula aula2 = new Aula("Aula 2", 45);
		Aula aula3 = new Aula("Aula 3", 10);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		

		aulas.sort(Comparator.comparing(Aula::getTempo));
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println("***************************");
		System.out.println(aulas);
		
		
		
	}
}
