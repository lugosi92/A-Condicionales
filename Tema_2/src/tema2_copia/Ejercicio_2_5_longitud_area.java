package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_5_longitud_area {

	public static void main(String[] args) {
		//Escribir una aplicación que calcule la longitud y el área de una circunferencia solicitando al usuario que introduzca el radio (con dos decimales).
		
		Scanner sc = new Scanner(System.in);
		
		//Variables de entrada 
				double radio, longCirculo, areaCirculo;
		
		//Variables de Entrada
		
		System.out.println("Introduce el radio con 2 decimales: ");
		radio = sc.nextDouble();
		
		//Formulas
		
		areaCirculo = Math.PI * Math.pow (radio, 2);
		//areaCirculo = sc.nextDouble();
		longCirculo = 2 * Math.PI * radio;
		//longCirculo = sc.nextDouble();
		
		//Salida
		System.out.println("La longitud del circulo es: " + longCirculo);
		System.out.println("La area del circulo es: " + areaCirculo);
	
		    }
	}


