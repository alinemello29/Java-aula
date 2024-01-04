package br.com.vainaweb;

public class QuartaAulaParte1 {
	public static void main(String[] args) {
		char nota = 'B';
		switch (nota) {
		case 'A':
			System.out.println("Você é um funcionário de grau A: bônus= " + 2000);
			break;
		case 'B':
			System.out.println("Você é funcionário de grau B: bônus= " + 1000);
			break;
		case 'C':
			System.out.println("Você é funcionário de grau C: Bônus = " + 500);
			break;
		default:
			System.out.println("Você é funcionário padrão: Bônus = " + 100);
			break;
		}
	}
}

//Retornando o número escolhido com Switch case
//01-11-2023
//  Estrutura Condicional - Switch-Case