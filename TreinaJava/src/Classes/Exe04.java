package Classes;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
	/*Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e o
      total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
      vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o
      seu nome, o sal�rio fixo e sal�rio no final do m�s.*/
		
		Scanner s = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo;
		double vendas;
		double comissao;
		double salarioFinal;
		
		System.out.println("Informe o nome do vendedor: ");
		nomeVendedor = s.nextLine();
		
		System.out.println("Informe o salario do vendedor: ");
		salarioFixo = s.nextDouble();
		
		System.out.println("Informe o total de vendas efetuado pelo vendedor: ");
		vendas = s.nextDouble();
		
		comissao  = (vendas * 0.015);
		
		
		salarioFinal = comissao + salarioFixo;
		
		System.out.println("Nome do vendedor ******************  R$ " + nomeVendedor);
		System.out.println("Salario Fixo *********************** R$ " + salarioFixo);
		System.out.println("Salario Final ********************** R$ " + salarioFinal);
		System.out.println("Total de comiss�o do vendedor ****** R$ " + comissao );
		
		s.close();

	}

}
