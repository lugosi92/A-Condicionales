package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_11_redondear_entero {

	public static void main(String[] args) {
		// Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.

		Scanner sc = new Scanner (System.in);
		
		   //Variables Entrada
		
		double numDecimal;
		long numEntero;
		
	       //Solicitudes
		
		System.out.println("Escribe un numero decimal--> ");
		numDecimal = sc.nextDouble();
		
	       //Formulas
		numEntero =	Math.round (numDecimal) ;
		
	      //Salida

				System.out.println("El numero entero--> " +numEntero);
	}

}
