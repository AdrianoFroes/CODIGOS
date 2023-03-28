package Classes;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		/*Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a
sua média (aritmética).*/
		
		Scanner s = new Scanner(System.in);
		
		String nome;
		double nota1,nota2,nota3,nota4;
		
		double media;
		
		System.out.println("Informe o nome do aluno ");
		nome = s.nextLine();
		
		System.out.println("Informe a Nota1 ");
		nota1 = s.nextDouble();
		
		System.out.println("Informe a Nota2 ");
		nota2 = s.nextDouble();
		
		System.out.println("Informe a Nota3 ");
		nota3 = s.nextDouble();
		
		System.out.println("Informe a Nota4 ");
		nota4 = s.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("Nome do aluno " + nome);
		System.out.println("a media das nota foi " + media);
		
		if(media >=7 ) {
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
		
		
		
		
		
		
		
		s.close();
		

	}

}
