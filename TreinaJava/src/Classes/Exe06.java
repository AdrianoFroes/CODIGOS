package Classes;

import java.util.Scanner;

public class Exe06 {
/*Escrever uma programa em que leia dois valores para as vari�veis A e B, e
efetuar as trocas dos valores de forma que a vari�vel A passe a possuir o valor
da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A. Apresentar
os valores trocados.
Lembrando que temos que ter 3 vari�veis para que uma haja como vari�vel
de armazenamento, ou seja, para evitar que o valor original de a se perca �
necess�rio associar a uma outra vari�vel (denominada usualmente de
vari�vel auxiliar) tal valor, estabelecer uma associa��o de a com o valor em b
e, por �ltimo, associar b ao valor "salvo" na vari�vel auxiliar*/
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Informe o valor de A ");
		a = s.nextInt();
		
		System.out.println("Informe o valor de B ");
		b = s.nextInt();
		
		c = 4;
		a = b;
		b = a;
		
		System.out.println("Valor da variavel A " + a);
		System.out.println("Valor da variavel B " + b);
		
		
		
		s.close();

	}

}
