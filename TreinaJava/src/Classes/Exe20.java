package Classes;

import java.util.Scanner;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.

*/
public class Exe20 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um mumero ");
		int numero = s.nextInt();
		
		int antecessor = numero - 1;
		
		System.out.println("O numero antecessor é " + antecessor);
		
		s.close();

	}

}
