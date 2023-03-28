package Classes;

import java.util.Scanner;

/*Informar um saldo e imprimir o saldo com reajuste de 1%.
*/
public class Exe18 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double saldo;
		
		System.out.println("Informe um saldo");
		saldo = s.nextDouble();
		
		saldo = saldo +(saldo * 0.01);
		System.out.println("Saldo com reajuste de 1% é " + saldo);
		
		
		s.close();
	
			
		

	}

}
