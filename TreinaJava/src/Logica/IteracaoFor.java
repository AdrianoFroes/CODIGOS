package Logica;

import java.util.Iterator;

public class IteracaoFor {

	public static void main(String[] args) {
		 
//		for(int i = 0;i <= 5;i++) {
//			
//			System.out.println("Uma frase...");
//		}
		
		Double[] carrinhoDeCompras = new Double[] {50.0,51.0,52.0};
		Double total = 0.0;
		for(int i = 0; i <=carrinhoDeCompras.length; i++ ){
			total += total  + carrinhoDeCompras[i];
					
			
		}
		
		System.out.println("Total " + total);
		

	}

}
