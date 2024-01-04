package br.com.vainaweb;

public class QuartaAulaParte4 {
	public static void main(String[] args) {
		 int preco = 10;
		 int quantidade = 100;
		  switch (preco) {
		     case 10:
		       switch (quantidade) {
		         case 100:
		         System.out.println("O novo preço é: " + (preco*0.9));
		         break;
		       default:
		        System.out.println("Desconto disponível apenas para 100 itens de valor igual a R$ 10!");
		       }
		       break;
		     case 20:
		       switch (quantidade) {
		         case 80:
		         System.out.println("O novo preço é: " + (preco*0.8));
		         break;
		       default:
		        System.out.println("Desconto disponível apenas para 80 itens de valor igual a R$ 20!");
		       }
		       break;
		     case 50:
		       switch (quantidade) {
		         case 60:
		         System.out.println("O novo preço é: " + (preco*0.7));
		         break;
		       default:
		        System.out.println("Desconto disponível apenas para 60 itens de valor igual a R$ 50!");
		       }
		       break;
		     case 100:
		       switch (quantidade) {
		         case 40:
		         System.out.println("O novo preço é: " + (preco*0.6));
		         break;
		       default:
		        System.out.println("Desconto disponível apenas para 100 itens de valor igual a R$ 10!");
		       }
		       break;
		     default:
		       System.out.println("Não há descontos disponíveis para esse valor!");
		  }
		 }
		}
//Calculando desconto com Switch case aninhadas
//01-11-2023
//Estrutura Condicional - Switch-Case