package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_7_par_boolean {

	public static void main(String[] args) {
		//Escribir un programa que pida al usuario un número entero, y devuelva mediante un literal booleano si el número es par.
		Scanner sc = new Scanner(System.in);
		
		//Variables Entrada
		int numero;
		boolean  par, impar;
		
		System.out.println("Introduce un numero entero--> ");
		numero = sc.nextInt();
	    //Solicitudes
		
	    //Formulas
		
		//Cuando el resto del numero introducido sea igual a 0 al dividirse entre dos nos dice que es par
		par = numero % 2 == 0;
		
	    //Salida
		System.out.println("El numero es par: " + par);
		
	}

}
