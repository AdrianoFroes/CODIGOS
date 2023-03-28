package Logica;

import java.util.Scanner;

public class CalcularTroco {

	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("Informe o valor do produto: ");
		 double valorProduto = s.nextDouble();
		 
		 System.out.print("Informe o tipo do pagamento [1 - Avista / 2 A prazo] ");
		 Integer tipoPagamento = s.nextInt();
		 
		 Boolean pagamentoAvista = tipoPagamento.equals(1);
		 
		 double juros = 0.0;
		 if(pagamentoAvista) {
			 
		 }else {
			 juros = 10.0;
		 }
		 
		 double acrescimo = valorProduto * juros / 100;
		 
		 double valorTotal = acrescimo + valorProduto;
		 
		 System.out.println("Valor total: " + valorTotal);
		 
		 
		 
		 s.close();

	}

}
