package Metodos;

public class Recursividade {

	public static void main(String[] args) {
		
		
	}
	
	static void imprimirNumero(Integer numero) {
		System.out.println("Numero " + numero);
		
		imprimirNumero(++numero);
	}

}
