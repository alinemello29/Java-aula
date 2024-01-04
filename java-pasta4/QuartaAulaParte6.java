package br.com.vainaweb;

import java.util.Scanner;

public class QuartaAulaParte6 {
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

		switch (opcao) {
			case 1: System.out.println("Hoje é domingo, pé de caximbo"); break;
			case 2: System.out.println("Hoje é segunda, que maravilha"); break;
			case 3: System.out.println("Hoje é terça, ainda tá bom"); break;
			case 4: System.out.println("Hoje é quarta, meio termo"); break;
			case 5: System.out.println("Hoje é quinta, ta chegando perto"); break;
			case 6: System.out.println("Hoje é sexta, opa, ninguém me segura"); break;
			case 7: System.out.println("Hoje é sábado, me perdi"); break;
			default: System.out.println("Opção inválida."); break;
		}
		
		sc.close();
	}	
}
//01-11-2023
//estrutura condicional - Switch case