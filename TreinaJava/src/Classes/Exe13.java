package Classes;

import java.util.Scanner;

public class Exe13 {
	/*
	 * Escreva um programa que entre com um número e o imprima caso seja maior
do que 20.
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero ");
		numero = s.nextInt();
		
		if(numero >= 20) {
			System.out.println("Numero digitado é " + numero);
		}else {
			//System.out.println("Numero menor que  " + numero);
		}
		
		
		s.close();
		
	}

}
