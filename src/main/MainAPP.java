/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package main;

import java.util.Scanner;

import objetos.Excepcion;

public class MainAPP {

	public static void main(String[] args) {

		int num;
		@SuppressWarnings("resource")
		Scanner consola = new Scanner(System.in);
		
		try {
			System.out.println("Introduce un valor entre 0 y 10");
			num = consola.nextInt();
			
			System.out.println("El numero indicado es " + num);
			
			if (num >= 0 && num <= 5) { throw new Excepcion(111);}
			else if(num > 5 && num <= 10) { throw new Excepcion(222);}
				
		} catch (Excepcion ex) {
			System.out.println(ex.getMessage());
		}
	}
}