package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int longuitud;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor introduzca la longitud de la tabla");
		longuitud=sc.nextInt();
		
		int tabla []=new int[longuitud];
		
		System.out.println(Ejercicio3.rellenaPares(longuitud, tabla));
	}

}
