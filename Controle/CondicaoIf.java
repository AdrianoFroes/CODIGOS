package Controle;

import java.util.Scanner;

public class CondicaoIf {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Informe a m�dia ");
		double media = s.nextDouble();

		if (media <=10 && media >= 7.0) {
			System.out.println("Aprovado ");
			System.out.println("Parab�ns ");
		}
	    
		 if(media < 7 && media > 4.5 ) {
			 System.out.println("Recupera��o ");
	     if(media < 4.5 && media >=0) {
	    	 System.out.println("Reprovado ");
	     }
	     s.close();
		 }
		 

	}

}
