package Classes;

import java.util.Scanner;

public class Exe09 {
/*Faça um programa que receba um valor que foi depositado e exiba o valor
com rendimento após um mês.
Considere fixo o juro da poupança em 0.70% a. m.*/
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		double deposito;
		double juros;
		double rendimento;
		
		System.out.println("Informa o valor do deposito ");
		deposito = s.nextDouble();
		
		juros = (deposito * 0.007);
		
		rendimento = juros + deposito;
		
		System.out.println("O rendimento na poupança foi de  " + rendimento + " R$");
		System.out.println("valor do juros calculado " + juros);
		
		
		
		
		
		s.close();

	}

}
