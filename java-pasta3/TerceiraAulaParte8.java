package br.com.vainaweb;

import java.util.Scanner; //importa tudo oque está presente na biblioteca.

public class TerceiraAulaParte8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade:");
		byte idade = sc.nextByte();
		boolean ePermitido = idade >= 18;
		
		String resultado = ePermitido ? "É permitido" : "Não é permitido";
		System.out.println(resultado);
		
		sc.close();
		
	}

}

//estrutura condicional 
//30-10-2023