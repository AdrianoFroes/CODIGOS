package Classes;

import java.util.Scanner;
/*Escrever um programa que receba dois n�meros e ao final mostre a soma,
subtra��o, multiplica��o e a divis�o dos n�meros lidos*/
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
		   
		   System.out.println("A soma dos numeros informado � " + soma);
		   System.out.println("A subtracao dos numeros informado � " + sub);
		   System.out.println("A multiplica��o dos numeros informado � " + mult);
		   System.out.println("A divisao dos numeros informado � " + div);
				   
		   
		   
		   s.close();
		

	}

}
