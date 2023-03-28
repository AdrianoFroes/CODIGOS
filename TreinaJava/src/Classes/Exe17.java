package Classes;

import java.util.Scanner;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/
public class Exe17 {

	public static void main(String[] args) {
	
		int media1 = (7+8+9)/3;
		int media2 = (4+5+6)/3;
		
		
		int soma = media1 + media2;
		
		System.out.println("A media dos numeros 7, 8 e 9 é: " + media1);
		System.out.println("A media dos numeros 4, 5 e 6 é: " + media2);
		System.out.println("A soma das duas medias é: " + soma);
		

	}

}
