package Classes;

import java.util.Scanner;

public class Exe10 {
/*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
prestações sem juros. Faça um programa que receba um valor de uma compra
e mostre o valor das prestações.*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double valorProduto;
		double valorPrestacao;
		int parcelas = 5;
		
		System.out.println("Informe o valor da compra ");
		valorProduto = s.nextDouble();
		
		valorPrestacao = valorProduto / parcelas;
		
		
		System.out.println("O valor da prestação é " + valorPrestacao + " R$");
		
				
				
		
		
		
		
		s.close();
		
		
		 

	}

}
