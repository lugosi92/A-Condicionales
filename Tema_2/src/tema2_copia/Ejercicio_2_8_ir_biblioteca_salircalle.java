package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_8_ir_biblioteca_salircalle {

	public static void main(String[] args) {
		/* Diseñar un algoritmo que nos indique si podemos salir a la calle. Los motivos que van a condicionar esta decisión son la lluvia y haber terminado nuestras tareas: solo podemos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
Hay una situación en la que tenemos que salir independientemente de todo lo anterior: para ir a la biblioteca (a hacer un trabajo, a sacar o devolver un libro, etc.).
El programa pedirá al usuario (mediante un booleano) si llueve, si ha finalizado las tareas, y si necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano (true o false) si es posible salir a la calle o no.*/

	/*	Scanner sc = new Scanner(System.in);
		//Variables Entrada
		boolean lluvia, terminado_tareas, biblioteca, puedes_salir;
		
	    //Solicitudes
		System.out.println("¿Esta lloviendo?--> ");
		lluvia = sc.nextBoolean();
		
		System.out.println("¿Has finalizado las tareas?--> ");
		terminado_tareas = sc.nextBoolean();
		
		System.out.println("¿Vas a ir a la biblioteca?--> ");
		biblioteca = sc.nextBoolean();
		
		 //Formulas
		
		puedes_salir = (!lluvia && terminado_tareas) || biblioteca ;
		
		
	    //Salida
		
		System.out.println("Puedes salir--> " + puedes_salir);
	}

}*/


		Scanner sc = new Scanner(System.in);
		
		boolean esta_lloviendo, ir_bibilioteca, tareas_terminadas, puedes_salir;
		
		System.out.println("Esta lloviendo ? ");
		esta_lloviendo = sc.nextBoolean();
		System.out.println("Tienes que ir a la biblioteca ?");
		ir_bibilioteca = sc.nextBoolean();
		System.out.println("Has terminado las tareas? ");
		tareas_terminadas = sc.nextBoolean();
		
		
		puedes_salir = (!esta_lloviendo && tareas_terminadas) || (ir_bibilioteca);
		
		System.out.println("Puedes salir?" + puedes_salir);
	
}
	
}
		
		

