package Classes;

import java.util.Scanner;

public class Exe12 {
	/*
	 * Escreva um programa para ler o raio de um circulo, calcular e escrever a sua
	 * �rea. (pR�) Calculo: �rea= PI*(raio�).
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        
		double raio;
		double PI = 3.14;
	    double area;
		
		System.out.println("Digite o raio do ciculo ");
		raio = s.nextDouble();
		
		area  = PI * (raio * raio);
		System.out.println("Area do ciculo � " + area);
		
		

		s.close();

	}

}
