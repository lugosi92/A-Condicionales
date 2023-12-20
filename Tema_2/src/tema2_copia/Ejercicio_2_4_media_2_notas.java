package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_4_media_2_notas {
	public static void main(String[] args) {
	//Crear una aplicación que calcule la media aritmética de dos notas enteras. Tener en cuenta que la media puede contener decimales.
		
		Scanner sc = new Scanner(System.in);
		
		//Variables Entrada
		
		double nota1, nota2, notaMedia;
		
		//Formulas
	    
		System.out.println("Introducir nota1--> ");
		nota1 = sc.nextDouble();
		System.out.println("Introducir nota2--> ");
		nota2 = sc.nextDouble();
		
		//Formulas
		notaMedia = (nota1 + nota2) / (2);
		
		//Salida

		System.out.println("La nota media es: " + notaMedia);
		
		
		
	}
}