package Ponto_De_Venda;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		/** 
		 * Variaveis -  total, desconto, totalDesconto, valorPago, troco(double)
		 * Entrada1 - total, desconto
		 * Processamento1 - totalDesconto = total - (desconto * total / 100
		 * Saida1 - total Desconto
		 * Entrada2 - valorPago
		 * Processamento2 - troco = valorPago -totalDesconto
		 * Saida2 troco
		 * */
		double total, desconto, totalDesconto, valorPago, troco;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#0.00");
		
		System.out.println("Digite o valor total: ");
		total = sc.nextDouble();
		System.out.println("Digite o desconto: ");
		desconto = sc.nextDouble();
		
		totalDesconto = total -(desconto * total) /100;
		
		System.out.println("O valor total do desconto é de: " + form.format(totalDesconto));
		
		System.out.println("Digite o valor pago: ");
		valorPago = sc.nextDouble();
		
		troco = valorPago - totalDesconto;
		
		System.out.println("O valor do troco é: " + form.format(troco));
		
		sc.close();
	}

}
