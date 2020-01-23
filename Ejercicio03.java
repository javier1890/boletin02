package boletin01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// leer numeros hasta que se introduzcan un 0. Para cada uno indicar si es par o impar
		
		Scanner leer=new Scanner(System.in);
		int n;
		do {
			System.out.println("Ingrese un numero:");
			n=leer.nextInt();
			
			if (n>0){  
				if (n%2==0) {
					System.out.println("Es par");
				}else{
					System.out.println("Es impar");
				}
			}else if(n<0){
				System.out.println("Es un numero negativo");
			}else {
				System.out.println("Presiono un numero 0,Adios!!");
				break;
			}
			
	
		}while(n!=0);
			

	}

}
