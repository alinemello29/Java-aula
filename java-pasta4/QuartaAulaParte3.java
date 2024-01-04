package br.com.vainaweb;

public class QuartaAulaParte3 {
	public static void main(String[] args) {
		int preco = 10;
		  switch (preco) {
		     case 10:
		        System.out.println("O novo preço é: " + (preco*0.9));
		        break;
		     case 20:
		        System.out.println("O novo preço é: " + (preco*0.8));
		        break;
		     case 50:
			        System.out.println("O novo preço é: " + (preco*0.7));
			        break;
		     case 100:
			        System.out.println("O novo preço é: " + (preco*0.6));
			        break;
			 default:
				 System.out.println("Não há desconto disponíveis para esse valor!");
		}
	}

}
//Calculando desconto com Switch case
//01-11-2023
//Estrutura Condicional - Switch-Case