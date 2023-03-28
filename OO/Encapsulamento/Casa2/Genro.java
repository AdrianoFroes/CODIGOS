package OO.Encapsulamento.Casa2;

import OO.Encapsulamento.Casa1.Sogro;

public class Genro {

	private String segredo = "Sogra fala demais";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("nunca falarei que " + euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoCasal);
		
		Sogro falador = new Sogro();
		System.out.println(falador.gostaDeCerveja);
		
		//Sogra faladora = new Sogra();
		//System.out.println(faladora.segredoDeFamilia);
	}
}
