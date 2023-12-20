package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_10_media_curso {

	public static void main(String[] args) {
		// Escribe un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario). 
		//El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera), y como se usa en el expediente académico (con decimales).

		Scanner sc = new Scanner(System.in);
		
		//Variables Entrada
		
		int nota1, nota2, nota3;
		double notaMedia;
		double notaMediasin;
		
	    //Solicitudes
		
		System.out.println("Escribe el numero entero de las notas del trimestre 1 : ");
		nota1 = sc.nextInt();
		System.out.println("Escribe el numero entero de las notas del trimestre 2 : ");
		nota2 = sc.nextInt();
		System.out.println("Escribe el numero entero de las notas del trimestre 3 : ");
		nota3 = sc.nextInt();
		
	    //Formulas
		
		notaMedia = (nota1 + nota2 + nota3) / 3.0;
		notaMediasin = (nota1 + nota2 + nota3) / 3;
	
	
	    //Salida

		System.out.println("Nota media en el boltin de calificaciones " +notaMedia);
		System.out.println("Nota media en el boltin de calificaciones " +notaMediasin);
	}

}
