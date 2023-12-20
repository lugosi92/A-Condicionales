package tema2_copia;

import java.util.Scanner;

public class Ejercicio_2_2_edad_mas_1 {
	public static void main(String[] args) {
		//Defino el scanner
				Scanner sc = new Scanner(System.in);
				System.out.println("Escribe tu edad: ");
				int  edad,  edad_final;
				
				edad = sc.nextByte();
				
				edad_final = (edad + 1);
				
				System.out.println("Tu edad final es: " + edad_final);
				
				
}
}