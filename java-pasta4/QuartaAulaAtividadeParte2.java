package br.com.vainaweb;

import java.util.Scanner;

public class QuartaAulaAtividadeParte2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Qual candidato você deseja realizar?");
	System.out.println("1 -> Candidato 1" + "\n2 -> Candidato 2" + "\n3 -> Candidato 3" + "\n4 -> Candidato 4");
	int opcao = sc.nextInt();
	
	switch (opcao) {
		case 1: System.out.println("Candidato 1 selecionado."); break;
		case 2: System.out.println("Candidato 2 selecionado."); break;
		case 3: System.out.println("Candidato 3 selecionado."); break;
		case 4: System.out.println("Candidato 4 selecionado."); break;
		default: System.out.println("Candidato não existe."); break;
	}

	sc.close();
}

}

//01-11-2023
//estrutura condicional
//Faça um menu de seleção de candidatos. Tarefa livre, pode ser feita como você entender melhor, desde que use Switch Case.