package OO.Encapsulamento.Casa2;

import OO.Encapsulamento.Casa1.Sogra;

public class Filha extends Sogra{
	
	String segredoCasal = "Demitido";
	
	public static void main(String[] args) {
		
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabe " + euMesma.segredoCasal);
		
		
	}

}
