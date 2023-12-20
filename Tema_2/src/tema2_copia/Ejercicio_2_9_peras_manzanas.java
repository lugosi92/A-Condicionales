package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_9_peras_manzanas {

	public static void main(String[] args) {
		// Un agricultor necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
		//Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta. 
		//La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está en 2,35 €, y el de peras en 1,95 €
		
		Scanner sc = new Scanner(System.in);
		
		
		//Variables Entrada
		
		int kManzanas;
		int kPeras;
		int eManzanas;
		int ePeras;
		double totalM;
		double totalP;
		
		
		
	    //Solicitudes
		
		System.out.println("Cuantos kilos de manzana se han vendido? ");
		kManzanas = sc.nextInt();
		System.out.println("Cuantos kilos de peras se han vendido? ");
		kPeras = sc.nextInt();
		
		
	    //Formulas
		double eManzanas1 = 2.35;
		totalM = kManzanas * eManzanas1;
		
		double ePeras1 = 1.95;
		totalP = kPeras * ePeras1;
	    //Salida
		
System.out.println("El total de peras es--> " + totalP);
System.out.println("El total de manzanas es-->" + totalM);


	}

}
