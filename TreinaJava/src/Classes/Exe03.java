package Classes;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
	/*	Escrever um programa para determinar o consumo médio de um automóvel
		sendo fornecida a distância total percorrida pelo automóvel e o total de
		combustível gasto.*/
		
		Scanner s = new Scanner(System.in);
		
		double TaxaDeConsumo;
		double km1;
		double km2;
		double kmtotal;
		double litros;
		
		System.out.println("Informe a km1 ");
		km1 = s.nextDouble();
		
		System.out.println("Informe a km2");
		km2 = s.nextDouble();
		
		System.out.println("Informe a quantidade de litros ");
		litros = s.nextDouble();
		
		
		kmtotal = km2 - km1;
		
		TaxaDeConsumo = kmtotal / litros;
		
		System.out.println("O Total percorrido foi de " + kmtotal + " km ");
		System.out.println("A taxa media de consumo é de " + TaxaDeConsumo + " litros por km percorrido");
		
		
		
		
		
		s.close();

	}

}
