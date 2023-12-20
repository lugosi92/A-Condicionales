package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_6_si_es_mator_edad {

	public static void main(String[] args) {
		// Escribir un programa que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).
		
		Scanner sc = new Scanner(System.in);
		
		//Variables Entrada
		int edad = 0;
		boolean mayor;
		boolean menor;
		
		//Solicitudes
		System.out.println("introduce tu edad: ");
		edad = sc.nextInt();
		
		//Formulas
		mayor = edad> 18;
		//edad = sc.nextInt();
		menor = edad< 18;
		//edad = sc.nextInt();
		
		
		//Salida
		System.out.println("Es mayor de edad: " + mayor);
		System.out.println("Es menor  de edad: " + menor);
	}

}
