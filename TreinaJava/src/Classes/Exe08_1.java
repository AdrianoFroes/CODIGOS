package Classes;

import java.util.Scanner;

public class Exe08_1 {
   /*Elaborar um programa que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o
usuário.*/
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
