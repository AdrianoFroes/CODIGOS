package Classes;

import java.util.Scanner;

public class Exe10 {
/*A Loja Mam�o com A��car est� vendendo seus produtos em 5 (cinco)
presta��es sem juros. Fa�a um programa que receba um valor de uma compra
e mostre o valor das presta��es.*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double valorProduto;
		double valorPrestacao;
		int parcelas = 5;
		
		System.out.println("Informe o valor da compra ");
		valorProduto = s.nextDouble();
		
		valorPrestacao = valorProduto / parcelas;
		
		
		System.out.println("O valor da presta��o � " + valorPrestacao + " R$");
		
				
				
		
		
		
		
		s.close();
		
		
		 

	}

}
