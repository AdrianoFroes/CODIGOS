package Classes;

import java.util.Scanner;

public class Exe07 {
/*7. Ler uma temperatura em graus Celsius e apresent�-la convertida em graus
Fahrenheit. A f�rmula de convers�o �: F=(9*C+160) / 5, sendo F a
temperatura em Fahrenheit e C a temperatura em Celsius.*/
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		double C,F;
		System.out.println("Informe a temperatura em Graus Celsio ");
		C = s.nextDouble();
		
		F = (9 * C + 160 ) / 5;
		
		System.out.println("A temperatura convertida para Fahrenheit � " + F);
		
		
		
		
		
		
		s.close();
		
	}

}
