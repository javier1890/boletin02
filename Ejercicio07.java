package boletin02;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// pedir numeros hasta que se teclee uno negativo y calcule la media
		
				Scanner leer=new Scanner(System.in);
				int n,i = 0,c=0;
				float result;
				do {
					System.out.println("Ingrese un numero:");
					n=leer.nextInt();
					i=i+n;
					c++;
				} while (n>0);
				
				result=(float)(i/c);
				System.out.println("La suma de numeros ingresados es:"+i);
				System.out.println("Los numeros ingresados son:"+c);
				System.out.println("La media de numeros ingresados es:"+result);
			}

	}


