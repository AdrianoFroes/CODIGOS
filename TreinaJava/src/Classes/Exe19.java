package Classes;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor 
 * do sal�rio de um usu�rio,calcule a quantidade de sal�rios m�nimos
 *  esse usu�rio ganha e imprima o resultado.
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
