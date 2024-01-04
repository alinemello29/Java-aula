package br.com.vainaweb;

import java.util.Scanner;

public class QuartaAulaParte7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dia da semana é hoje? ");
		System.out.println("1 -> Domingo" + "\n2 -> Segunda" + "\n3 -> Terça" + "\n4 -> Quarta" + "\n5 -> Quinta"
				+ "\n6 -> Sexta" + "\n7 -> Sábado");
		int opcao = sc.nextInt();

		String diaSemana = switch (opcao) {
		case 1 -> "Domingo";
		case 2 -> "Segunda";
		case 3 -> "Terça";
		case 4 -> "Quarta";
		case 5 -> "Quinta";
		case 6 -> "Sexta";
		case 7 -> "Sábado";
		default -> "Não existe";
		};

		System.out.println(diaSemana);

		sc.close();
	}
}

//estrutura condicional 
//01-11-2023
//Switch Expression - Ternário do Switch Case