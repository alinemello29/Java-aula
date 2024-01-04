package br.com.vainaweb;

import java.util.Scanner;

public class QuartaAulaAtividadeParte1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o primeiro valor? ");
		int primeiroValor = sc.nextInt();

		System.out.println("Qual o segundo valor? ");
		int segundoValor = sc.nextInt();

		System.out.println("Qual operação deseja realizar? ");
		System.out.println("1 -> Soma" + "\n2 -> Subtração" + "\n3 -> Divisão" + "\n4 -> Multiplicação");
		int opcao = sc.nextInt();
		
		switch (opcao) {
			case 1: System.out.println("Resultado: " + (primeiroValor + segundoValor)); break;
			case 2: System.out.println("Resultado: " + (primeiroValor - segundoValor)); break;
			case 3: System.out.println("Resultado: " + (primeiroValor / segundoValor)); break;
			case 4: System.out.println("Resultado: " + (primeiroValor * segundoValor)); break;
			default: System.out.println("Opção inválida."); break;
		}

		sc.close();
	}
}
//01-11-2023
//estrutura condicional
//Faça uma calculadora de soma, subtração, divisão e multiplicação utilizando os switch's.