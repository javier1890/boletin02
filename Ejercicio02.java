package boletin01;

import java.util.Scanner;


public class Ejercicio02 {

	public static void main(String[] args) {
		// leer un numero e indicar si es positivo o negativo.El proceso se repetira hasta que se introduzca un 0
		Scanner leer=new Scanner(System.in);
		int n;
		do {
			System.out.println("Ingrese un numero:");
			n=leer.nextInt();
			
			if (n>0) {
				System.out.println("es positivo");
			}else if (n<0) {
				System.out.println("es negativo");
			}else{
				System.out.println("Ha ingresado un 0, adios!!");
				break;
			}
		} while (n>0);
	}

}
