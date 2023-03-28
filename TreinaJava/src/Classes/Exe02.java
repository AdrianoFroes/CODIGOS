package Classes;

import java.util.Scanner;
/*Escrever um programa que receba dois números e ao final mostre a soma,
subtração, multiplicação e a divisão dos números lidos*/
public class Exe02 {

	public static void main(String[] args) {
		
		   Scanner s = new Scanner (System.in);
		   
		   int x,y;
		   
		   int soma,sub,div,mult;
		   
		   System.out.println("Digite o primeiro numero ");
		   x = s.nextInt();
		   
		   System.out.println("Digite o segundo numero ");
		   y = s.nextInt();
		   
		   soma = x + y;
		   sub = x - y;
		   div = x * y;
		   mult = x / y;
		   
		   System.out.println("A soma dos numeros informado é " + soma);
		   System.out.println("A subtracao dos numeros informado é " + sub);
		   System.out.println("A multiplicação dos numeros informado é " + mult);
		   System.out.println("A divisao dos numeros informado é " + div);
				   
		   
		   
		   s.close();
		

	}

}
