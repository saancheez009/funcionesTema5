package Ejercicio1;

import java.util.Arrays;

public class main {

public static void main(String[] args) {
		
		int tabla[]=new int [10];
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=(int)(Math.random()*100);
			
		}

		System.out.println(Arrays.toString(tabla));
		
		long suma= Ejercicio1.suma(tabla);
		
		System.out.println("La suma de todos los elementos es: "+suma);
		
	}
}
