package boletin02;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// pedir numeros hasta que se teclee 0 ,mostrar la suma de todos los numeros introducidos
		Scanner leer=new Scanner(System.in);
		int n,i = 0;
		do {
			System.out.println("Ingrese un numero:");
			n=leer.nextInt();
			i=i+n;
		} while (n!=0);
		
		System.out.println("La suma de numeros ingresados es:"+i);
	}

}
