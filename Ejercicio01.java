package boletin01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// leer un numero y mostrar su cuadrado ,repetir el proceso hasta que introduzca un numero negativo

		Scanner leer=new Scanner(System.in);
		int a,retultado;
		
		do {
			System.out.println("Ingrese un numero:");
			a=leer.nextInt();
			if (a<=0) {
				System.out.println("\nes negativo o quizas sea cero ,hata pronto!!");
				break;
			}
			
			retultado=(int)(Math.pow(a,2));
			System.out.println("\nel resultado es:"+retultado+"\n\n");
		} while (a>0);
		
		
				
	}

}
