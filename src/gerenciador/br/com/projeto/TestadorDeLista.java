package gerenciador.br.com.projeto;

import java.util.ArrayList;
import java.util.Collections;

public class TestadorDeLista {

	public static void main(String[] args) {
		
		String aula1 = "Aula 1";
		String aula2 = "Aula 2";
		String aula3 = "Aula 3";
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add(aula3);
		lista.add(aula2);
		lista.add(aula1);
		
		System.out.println("**********************");

		lista.forEach(aula -> {System.out.println(aula);});
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
	}
}
