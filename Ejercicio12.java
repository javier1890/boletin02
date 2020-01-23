package boletin02;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// pedir un numero y calcule su factorial

		int n,factorial=1;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese un numero que desea calcular el factorial:");
		n = leer.nextInt();

		
		for (int i = 1; i <= n; i++) {
			factorial=factorial*i;
		}
		
		System.out.println("El factorial de "+n+" es "+factorial);
	}

}
