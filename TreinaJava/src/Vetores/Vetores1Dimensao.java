package Vetores;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		
		String[] cardapio = new String [] {"Calabreza ", "Atum ", "Queijo ", "Presunto"};
         
		System.out.println("Escolha o sabor ");
		
		for(int i = 0;  i < cardapio.length; i++) {
			System.out.println("[" + i  + "] " + cardapio[i]);
		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o numero referente ao sabor: ");
		Integer saborEsolhido = s.nextInt();
		
		
		System.out.println("Sabor escolhido " + cardapio[saborEsolhido]);
		
		s.close();
	}

}
