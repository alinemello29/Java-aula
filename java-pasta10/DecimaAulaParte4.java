package br.com.vainaweb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimaAulaParte4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		// Adicionando um por um
		numeros.add(sc.nextInt());
		numeros.add(sc.nextInt());
		numeros.add(sc.nextInt());

		// Usando o for
		
		for (int i = 0; i < 10; i++) {
			numeros.add(sc.nextInt());
		}
		
		System.out.println(numeros.toString());
		sc.close();
		
	}


}
//Adicionando com scanner
//17/11 | Wrappers e ArrayList