package boletin02;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// mostrar el producto de los 10 primeros numeros impares
		int i=0;
		int c=1;
		int sumar=0;
		
		
		do {
			
			
			c++;
			if (c%2!=0) {
				sumar=sumar+c;
				System.out.println(c);
				i++;
			}
			
			
		} while (i<10);

		System.out.println("la suma de los primeros 10 valores impares es:"+sumar);
	}

}
