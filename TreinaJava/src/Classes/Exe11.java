package Classes;

import java.util.Scanner;

public class Exe11 {
	/*
	 * Fa�a um programa que receba o pre�o de custo de um produto e mostre o valor
	 * de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um
	 * percentual informado pelo usu�rio.
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double precoDeCusto;
		double acrescimo;
		double valorVenda;

		System.out.println("Informa o pre�o de custo do produto ");
		precoDeCusto = s.nextDouble();

		System.out.println("Informe a porcentagem de acrescimo ");
		acrescimo = s.nextDouble();

		valorVenda = (precoDeCusto * acrescimo) / 100 + precoDeCusto;

		System.out.println("O valor de venda do produto � " + valorVenda + " R$ ");

		s.close();

	}

}
