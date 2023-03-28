package Classes;

import java.util.Scanner;

public class Exe01 {
	/*Escrever um programa java que receba dois números e exiba o resultado da
sua soma.*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int sum;
		
		System.out.println("Informe um numero1 ");
		numero1 = s.nextInt();
		
		System.out.println("Informe o numero2 ");
		numero2 = s.nextInt();
		
		sum = numero1 + numero2;
		
		System.out.println("A soma dos numeros é " + sum);
		
		
				
		
		
		
		
		s.close();
	}
	
   
}
