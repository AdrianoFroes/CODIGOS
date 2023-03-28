package Classes;

import java.util.Scanner;

public class Exe06 {
/*Escrever uma programa em que leia dois valores para as variáveis A e B, e
efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
da variável B e a variável B passe a possuir o valor da variável A. Apresentar
os valores trocados.
Lembrando que temos que ter 3 variáveis para que uma haja como variável
de armazenamento, ou seja, para evitar que o valor original de a se perca é
necessário associar a uma outra variável (denominada usualmente de
variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b
e, por último, associar b ao valor "salvo" na variável auxiliar*/
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
