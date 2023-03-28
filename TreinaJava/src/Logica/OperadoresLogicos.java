package Logica;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		
		Boolean carrinhoMaior100 = true;
		Boolean periodoPromocao = true;
		
		Boolean aplicarDesconto = carrinhoMaior100 && periodoPromocao;
		
		if(aplicarDesconto) {
			System.out.println("Sim aplicar desconto ");
		}else {
			System.out.println("Nao aplicar desconto ");
		}
		
		
				
	}

}
