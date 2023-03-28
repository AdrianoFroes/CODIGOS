package Logica;

import java.util.Scanner;

public class AlterarVariavel {

	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
		 
        System.out.print("Digite o valor do produto ");
		 double valorProduto = s.nextDouble();
		 
		 System.out.println("Informe a quantidade dos produtos");
		 double valorCliente = s.nextDouble();
		 
		 double resultado = valorCliente - valorProduto;
		 
		 System.out.println("valor do produto " + valorProduto);
		 
		 System.out.println("Troco " + resultado);
		 
		 s.close();

	}

}
