package Classes;

import java.util.Scanner;

public class Exe08_1 {
   /*Elaborar um programa que efetue a apresenta��o do valor da convers�o em
real (R$) de um valor lido em d�lar (US$). O algoritmo dever� solicitar o valor
da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o
usu�rio.*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double real;
		double dolar;
		double cotacao;
		
		System.out.println("informa a quantidade em Dolar ");
		dolar = s.nextDouble();
		
		System.out.println("Informe a cotacao do Dola ");
		cotacao = s.nextDouble();
		
		real = dolar * cotacao;
		
		System.out.println("Quantidade em reais " + real + " RS");
		
		
		
		
		
		
		s.close();
		

	}

}
