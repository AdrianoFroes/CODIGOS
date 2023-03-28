package Classes;

import java.util.Scanner;

public class Exe15 {
	/*
	 *Entrar com dois números eimprimi-los em ordem decrescente (suponha
números diferentes
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Digite um valor para X ");
		x= s.nextInt();
		
		System.out.println("Digite um valor para Y ");
		y = s.nextInt();
		
		if(x>y) {
			System.out.println(+x+"....." +y);
		}else {
			if(x<y) {
				System.out.println(+y+"......." + x);
			}
		}
		
		
		s.close();
	
     
	}

}
