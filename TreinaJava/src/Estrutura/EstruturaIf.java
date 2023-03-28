package Estrutura;

public class EstruturaIf {

	public static void main(String[] args) {
		
		
		  Boolean movimentaMetadeValor = true;
		  Boolean tempoDeAbertura = true;
		  Boolean temNomeLimpo = true;
		  
		  Boolean liberarEmprestimo = movimentaMetadeValor &&
				  tempoDeAbertura && temNomeLimpo;
		  
		  if(liberarEmprestimo) {
			  
			  System.out.println("sim pode liberar emprestimos ");
		  }
		  

	}

}
