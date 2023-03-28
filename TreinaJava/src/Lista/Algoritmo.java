package Lista;

public class Algoritmo {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Adriano";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Maria";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Joao";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Thiago";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Raimundo";
		lista.adicionar(aluno);
		
		
		for(int i = 0; i <lista.tamanho(); i ++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno: " + a.nome);
		}
		

	}

}
