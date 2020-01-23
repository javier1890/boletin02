package boletin02;

import java.util.Scanner;

public class Ejericicio14 {

	public static void main(String[] args) {
		// Pedir 10 sueldos .Mostrar su suma y cuantos hay mayores de 1000
        
		int a,suma=0;
		int conta_mil=0;
		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ")Ingrese el sueldo:");
			a = leer.nextInt();
            
			if (a > 1000) {
				// la cantidad de los numeros positivos
                conta_mil++;
			} 
           suma=suma+a;
		}
		System.out.println("La suma de los sueldos es:"+suma);
		System.out.println("El numero de sueldos mayor a 1000 es:"+conta_mil);
	}

}
