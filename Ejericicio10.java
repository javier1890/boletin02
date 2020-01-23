package boletin02;

import java.util.Scanner;

public class Ejericicio10 {

	public static void main(String[] args) {
		// Escribir 15 numros y obtener su suma total
		
		
	    int n,suma=0;
        Scanner leer=new Scanner(System.in);
        
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Ingrese un numero ("+(i+1)+")");
			n=leer.nextInt();
			
			suma=suma+n;
		}
		System.out.println("La suma total es:"+suma);
	}

}
