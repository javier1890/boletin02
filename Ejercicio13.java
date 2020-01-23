package boletin02;

import java.util.Scanner;

public class Ejercicio13 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// Pedir 10 numeros .Mostrar la media de los numeros positivos , la media de los numeros negativos y la cantidad de ceros
		
		int a[]=new int[10];
		int cont_pos=0;
		int cont_neg=0;
		int cont_cero=0;
		int sum_pos=0;
		int sum_neg=0;
		
		float resul_neg=0;
		float resul_pos=0;
		
		Scanner leer=new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+")Ingrese un numero:");
			a[i]=leer.nextInt();
			
			if (a[i]>0) {
				//la cantidad de los numeros positivos
				sum_pos=sum_pos+a[i];
				cont_pos++;
				
			}else if(a[i]==0){
				//la cantidad de numeros cero
				
				cont_cero++;
			}else {
				//la cantidad de los numeros positivos
				sum_neg=sum_neg+a[i];
				cont_neg++;
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+")numero:"+a[i]+"\t\t");
		}
		
		//opraracion de promedio
		resul_neg=(float)(sum_neg/(float)cont_neg);
		resul_pos=(float)(sum_pos/(float)cont_pos);
		
		System.out.println("1)Promedio de numeros positivos:"+resul_neg+"\t\t");
		System.out.println("2)Promedio de numeros negativos:"+resul_pos+"\t\t");
		System.out.println("3)Cantidad de ceros:"+cont_cero+"\t\t");
	}

}
