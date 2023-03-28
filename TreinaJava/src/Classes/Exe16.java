package Classes;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/
public class Exe16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade_anos;
		int idade_meses;
		int idade_dias = 0;
		int total_dias;
		
		System.out.println("Informe tua idade");
		idade_anos = s.nextInt();
		
		System.out.println("Informe quantos meses");
		idade_meses = s.nextInt();
		
		System.out.println("Informe quantos dias");
		total_dias = s.nextInt();
		
		total_dias = total_dias + (idade_anos * 365);
		total_dias = total_dias + idade_dias;
		
		System.out.println("O total de dias é = " + total_dias);
		

		s.close();

	}

}
