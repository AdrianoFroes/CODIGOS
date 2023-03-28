package Metodos;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		String[] cursos = new String[] {"Java EE", "Spring " ,"Java" };
		
		System.out.println("Escolha um Curso abaixo ");
		
		for(int i =0; i< cursos.length; i++) {
             System.out.println("[ " + i + " ]" + cursos[i]);
             
		}
		System.out.println("Curso escolhido ");
		Integer posicaoCursoEscolhido = s.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if(!posicaoValida) {
			System.out.println("Posicao Invalida");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"cartao ", "Boleto "};
		
		System.out.println("Escolha forma de pagamento ");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[ " + i + "] " + formasPagamento[i]);
		}
		
		if(!posicaoValida) {
			System.err.println("Posição invalida ");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoCursoEscolhido];
		
		imprimirTraco();
		
		System.out.println("O Curso escolhido foi " + cursoEscolhido + "Foma de pagamento " + formaPagamentoEscolhida);;
		
		s.close();

	}
	
	static void imprimirTraco() {
		System.out.println("-------------------------------------------------");
		
	}

}
