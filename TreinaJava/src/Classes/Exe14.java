package Classes;

import java.util.Scanner;

public class Exe14 {
	/*
	 * Entrar com dois n�meros e imprimir o menor n�mero (suponha n�meros
diferentes).
	 */
	public static void main(String[] args) {
	   
		Scanner s = new Scanner(System.in);
		 
		int x,y;
		
		System.out.println("Digite um numero");
		x = s.nextInt();
		
		System.out.println("Digite outro numero diferente do primeiro");
		y = s.nextInt();
		
		if(x<y) {
			System.out.println("O menor numero digitado � " + x);
		}else {
			if(x>y) {
				System.out.println("o menor numero digitado � " + y);
			}
		}
			
		
		
		s.close();
     
	}

}
