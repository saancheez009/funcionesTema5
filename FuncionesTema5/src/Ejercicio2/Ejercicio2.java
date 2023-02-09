package Ejercicio2;

import java.util.Arrays;

public class Ejercicio2 {

	public static  int maximo(int tabla[]) {
		int maximo=0;
		for(int i=0;i<tabla.length; i++) {
			tabla[i]=(int) (Math.random()*100);
			
			 maximo = tabla[i]; // Declaramos e inicializamos el máximo.
		
				if (maximo < tabla[i])
					maximo = tabla[i];
		}
		
		System.out.println(Arrays.toString(tabla));
		return maximo;
		

	}

}
