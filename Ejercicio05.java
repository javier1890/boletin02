package boletin02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// realizar un juego para adivinar un numeroo .Para ello pedir un numero N,y luego ir pidiendo numeros
		//indicando "mayor" o "menor" segun sea mayor o menor con respecto a N. EL proceso termina cuando el usuario acierta.
		int azar;
		
		String normal=" ";
		Scanner leer=new Scanner(System.in);
		
		azar=(int)(Math.random()*10)+1;
		
		
		int n,i = 0;
		do {
			System.out.println("Adivine el numero "+normal);
			System.out.println("Ingrese un numero:");
			n=leer.nextInt();
			
			if (n==azar) {
				System.out.println("ha adivinado, felicidades!!!");
				break;
			}
			else if(azar>n){
				System.out.println("Ingrese un numero mayor");
				normal="mayor";
				n=leer.nextInt();
			}else {
				System.out.println("Ingrese un numero menor");
				normal="menor";
				n=leer.nextInt();
			}
			
		} while (n!=azar);
		
		System.out.println("El numero aleatorio es:"+azar);
		System.out.println("el numero ingresado es:"+n);

	}

}
