package Fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		//Scanner a = new Scanner(System.in);
		Byte b = 100;
		short s = 1000;
		
		//Integer i = Integer.parseInt(a.next());
	    Integer i = 10000;
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		//System.out.println(s.toString());
		System.out.println( i * 3);
		System.out.println( l /3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println( c + "...");
		
		
		
		
		
		
	//	a.close();
		
	}

}
