package Classes;

import java.util.Scanner;

public class Exe11 {
	/*
	 * Faça um programa que receba o preço de custo de um produto e mostre o valor
	 * de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
	 * percentual informado pelo usuário.
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double precoDeCusto;
		double acrescimo;
		double valorVenda;

		System.out.println("Informa o preço de custo do produto ");
		precoDeCusto = s.nextDouble();

		System.out.println("Informe a porcentagem de acrescimo ");
		acrescimo = s.nextDouble();

		valorVenda = (precoDeCusto * acrescimo) / 100 + precoDeCusto;

		System.out.println("O valor de venda do produto é " + valorVenda + " R$ ");

		s.close();

	}

}
