package boletin01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// realizar un juego para adivinar un numeroo .Para ello pedir un numero N,y luego ir pidiendo numeros
		//indicando "mayor" o "menor" segun sea mayor o menor con respecto a N. EL proceso termina cuando el usuario acierta.
		
		Scanner leer=new Scanner(System.in);
		int n,i = 0;
		do {
			System.out.println("Ingrese un numero:");
			n=leer.nextInt();
			i++;
		} while (n>0);
		
		System.out.println("La cantidad de numeros ingresados es:"+i);

	}

}
