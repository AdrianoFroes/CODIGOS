package JavaPOO;

public class ClassProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;
        
        
        exibirQuantidadeEstoque(produto);
		
		

	}
	
	static void exibirQuantidadeEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto \n"
	   + produto.nome + " � do " + produto.quantidade + " e o pre�o unitario �   " + produto.precoUnitario);
		
		
	}

}
