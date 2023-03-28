package Estrutura;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe o Peso ");
		double peso = s.nextDouble();

		Boolean pesoLeve = peso <= 60;
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;

		if (pesoLeve) {
			System.out.println("O lutador é peso leve");
		} else {

			if (pesoMedio) {
				System.out.println("O lutador é peso Medio");

			} else {

				if (pesoPesado) {
					System.out.println("O lutador é peso Pesado");
				}
			}
		}

		s.close();

	}

}
