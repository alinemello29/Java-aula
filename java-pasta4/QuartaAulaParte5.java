package br.com.vainaweb;

import java.util.Scanner;

public class QuartaAulaParte5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dia da semana é hoje? ");
		System.out.println("1 -> Domingo"
				+ "\n2 -> Segunda"
				+ "\n3 -> Terça"
				+ "\n4 -> Quarta"
				+ "\n5 -> Quinta"
				+ "\n6 -> Sexta"
				+ "\n7 -> Sábado");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.println("Hoje é domingo, pé de caximbo");
		} else if (opcao == 2) {
			System.out.println("Hoje é segunda, que maravilha");
		} else if (opcao == 3) System.out.println("Hoje é terça, ainda tá bom");
		else if (opcao == 4) System.out.println("Hoje é quarta, meio termo");
		else if (opcao == 5) System.out.println("Hoje é quinta, ta chegando perto");
		else if (opcao == 6) System.out.println("Hoje é sexta, opa, ninguém me segura");
		else if (opcao == 7) System.out.println("Hoje é sábado, me perdi");

		sc.close();
	}
}
//01-11-2023
//Estrutura Condicional - if e else