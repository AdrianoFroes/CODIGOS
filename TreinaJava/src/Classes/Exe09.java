package Classes;

import java.util.Scanner;

public class Exe09 {
/*Fa�a um programa que receba um valor que foi depositado e exiba o valor
com rendimento ap�s um m�s.
Considere fixo o juro da poupan�a em 0.70% a. m.*/
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		double deposito;
		double juros;
		double rendimento;
		
		System.out.println("Informa o valor do deposito ");
		deposito = s.nextDouble();
		
		juros = (deposito * 0.007);
		
		rendimento = juros + deposito;
		
		System.out.println("O rendimento na poupan�a foi de  " + rendimento + " R$");
		System.out.println("valor do juros calculado " + juros);
		
		
		
		
		
		s.close();

	}

}
