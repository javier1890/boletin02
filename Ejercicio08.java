package boletin02;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//pedir un numero N y mostrar todos los numeros del 1 al N
        int n;
        Scanner leer=new Scanner(System.in);
        
		System.out.println("Ingrese un numero limite:");
		n=leer.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			
			
			
		}
	}
}

