package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_3_calcular_edad {
	
	//Escribir una aplicación que pida al usuario el año actual y el año de nacimiento del usuario. 
	//El programa calculará su edad, suponiendo que en el año actual el usuario ya ha cumplido los años.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int fechaNacimiento, fechaActual, edadActual;
		
		
		System.out.println("Introduce año actual: ");
		fechaNacimiento = sc.nextInt();
		System.out.println("Introduce año nacimiento: ");
		fechaActual = sc.nextInt();
		
		fechaNacimiento = sc.nextInt();
		fechaActual = sc.nextInt();
		edadActual = sc.nextInt();
		
		edadActual = fechaNacimiento - fechaActual;
		
		System.out.println("El año que viene tendras: " +edadActual);
	}

}
