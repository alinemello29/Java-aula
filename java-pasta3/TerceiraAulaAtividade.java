package br.com.vainaweb;

import java.util.Scanner;

public class TerceiraAulaAtividade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float total;
		
		System.out.println("Digite o valor do produto:");
		float price = sc.nextFloat();
		System.out.println("Qual o metodo de pagamento? \n1)Dinheiro ou cheque \n2)Credito \n3)Debito");
		int paymentMethod = sc.nextInt();
		
		if(paymentMethod == 1) {
			total = price - (price * 0.1f);
			System.out.println("Total com desconto:" + total);
		}else if (paymentMethod == 2) {
			total = price + (price * 0.15f);
			System.out.println("Total com juros:" + total);
		}else {
			total = price;
			System.out.println("Total da compra:" + total);
		}
		sc.close();
		}
}
//1. Elabore um algoritmo que calcule o que deve ser pago por um produto, 
//considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
//Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
//escolhida e efetuar o cálculo adequado


//**Condição de pagamento**
//- À vista em dinheiro ou cheque, recebe 10% de desconto.
//- À vista no cartão crédito tem juros de 15%.
//- Cartão de débito não tem desconto nem juros.