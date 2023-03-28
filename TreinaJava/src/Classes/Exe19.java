package Classes;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor 
 * do salário de um usuário,calcule a quantidade de salários mínimos
 *  esse usuário ganha e imprima o resultado.
(1SM=R$788,00)

*/
public class Exe19 {

	public static void main(String[] args) {
	
	   Scanner s = new Scanner(System.in);
	   
	 
	   System.out.print("Informe o valor do salario Minimo R$ ");
	   double salarioMinimo = s.nextDouble();
	   
	   System.out.print("Informe o salario do colaborador: ");
	   double salario = s.nextDouble();
	   
	  double qtdSalariosMinimos = Math.round(salario / salarioMinimo);
	   
	   System.out.println("o Colaborador recebe " + qtdSalariosMinimos + " Salarios Minimos");
	   
	   
	   
	   s.close();
          			
		

	}

}
