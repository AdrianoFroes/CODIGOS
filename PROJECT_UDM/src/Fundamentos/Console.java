package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String numero = null;
		int n = Integer.parseInt(numero);
		
		System.out.println("Informe um numero ");
		
		if(n % 2 == 0) {
			System.out.println("Numero � Par");
		}else {
			System.out.println("Numero � impar");
		}
		s.close();

	}

}
