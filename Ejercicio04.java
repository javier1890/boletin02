package boletin01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introduccido
		
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
