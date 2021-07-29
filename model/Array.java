package model;

public class Array {
	// Método que devuelve los impares hasta n
	public static int[] oddsToArray(int n) {
		int[] array=new int[0]; // Lo devuelvo en caso de que n no sea correct
		int j=0;
		int numeros=0;
		if(n>0) {
			if(n%2==0) {
				numeros=(n/2);
			}
			else {
				numeros=(n/2)+1;
			}	
			array=new int[numeros];
			for (int i = 1; i <= n; i=i+2) { // Impares desde 1 hasta n (incluido)
				array[j]=i;
				j++;
			}
		}

		return array;
	}
}
