package es.studium.CadenaMayuMinu;

import java.util.Scanner;

public class CadenaMayuMinu 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Dame una cadena:");
		cadena= teclado.next();
		System.out.println("May�sculas:"+cadena.toUpperCase());
		System.out.println("Min�scula:"+cadena.toLowerCase());
		teclado.close();
		
	}

}
