package Fundamentos;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
           
        System.out.print("Digite um número decimal: ");
        int decimal = s.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("O numero convertido decimal para OCTAL É : " + octal);
   	
		
		
		s.close();
		

	}

}
