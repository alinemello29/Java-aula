package br.com.vainaweb;

import java.util.ArrayList;
import java.util.List;

public class DecimaAulaParte3 {
	public static void main(String[] args) {
		List<String> listaT1 = new ArrayList<>();
		
		listaT1.add("Roberta");
		listaT1.add("Jordan");
		listaT1.add("Vanessa");
		listaT1.add("Deise");

		System.out.println("Lista antes da adição: " + listaT1.size());
		listaT1.add("Amanda");
		System.out.println("Lista depois da adição: " + listaT1.size());
		System.out.println("Primeira posição antes: " + listaT1.get(0));
		listaT1.set(0, "Leno");
		System.out.println("Primeira posição depois: " + listaT1.get(0));

		System.out.println("\n----------Lista Completa----------");
		System.out.println(listaT1.toString());
		// ou usando o for
		for (String l : listaT1) {
			System.out.println(l);
		}

		System.out.println("\n----------verificação----------");
		System.out.println(listaT1.contains("Deise"));
	}
	

}
//ArrayList
//17/11 | Wrappers e ArrayList