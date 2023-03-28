package Logica;

import java.util.Scanner;

public class Constante {

	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
		 
		 final int idadeMinima = 18;
		 
		 System.out.print("Informe a Idade ");
		 Integer idade = s.nextInt();
		 
		 Boolean podeTirarCarteira = idade >= idadeMinima;
		 
		 if(podeTirarCarteira) {
			 System.out.println("Sim pode tirar carteira");
		 }else {
			 System.out.println("Nao pode tirar carteira");
		 }
		 
		 
		 
		 s.close();

	}

}
