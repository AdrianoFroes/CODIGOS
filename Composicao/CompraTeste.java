package Composicao;

public class CompraTeste {

	public static void main(String[] args) {
	
		 Compra compra1 = new Compra();
		 compra1.cliente = "Adriano Froes";
		 
		 compra1.adicionarItem(new Item("Caneta ",20,7.45));
		 compra1.adicionarItem(new Item("Borracha ",12,3.89));
		 compra1.adicionarItem(new Item("Caneta ",3,18.79));
		 compra1.adicionarItem(new Item("Caneta ",3,25.98));
		 
		 System.out.println(compra1.itens.size());
		 System.out.println(compra1.obterValorTotal());
		 

	}

}
