package Ejercicio3;

import java.util.Arrays;

public class Ejercicio3 {

	public static int[] rellenaPares(int longitud, int[] tabla) {
		
		for(int i=0;i<tabla.length; i++) {
			tabla[i]=(int) (Math.random()*100);
			if (tabla[i]%2!=0) {
				tabla[i]++;
			}
			
		}
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
		
		return tabla;
		
	}

}
