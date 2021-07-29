package control;

import java.util.Arrays;

import model.Array;
import model.Elf;
import model.JavaKeyword;
import model.Warrior;
import model.Wizard;

/*
1. Empleando TDD, crea un método que coja un entero n y devuelva un array de todos los 
impares enteros desde 1 hasta n, escribe tus tests primero!


2. Java tiene ciertas palabras que son consideradas "Java Keywords". Keywords son palabras reservadas
que no se pueden usar como nombres de variables. Empleando TDD, crea un método que coja un String
devuelva verdadero si el String contiene alguna Java Keywords.
Por ejemplo, break es una Keyword. El String "Don't break my hearth" should return true.
El String "I love to breakdance" deberia devolver falso. Necesitaras usar Google para encontrar
la lista de todas las Java Kewywords.


3. Crea la clase Jugador para un videojuego. Ten en cuenta el estado del jugador(vida, fuerza, vidas, etc).
Crea 3 subcalses, Warrior, Elf, Wizard. Pon al menos un comportamiento especial para cada uno.


4. Empleando TDD, crea un metodo que decremente la vida de un jugador. El método debe reducir el numero de vidas por 1 y restaurar la vida
original del jugador a su estado inicial.


// 5. Empleando TDD, crea un metodo que permita que un jugador ataque a otro. Cuando un jugador ataca a otro,
la vida del atacado decrementará por la fuerza del atacador. Por ejemplo, si el jugador A tiene 5 de fuerza
y el jugador B tiene 20 de vida, cuando el jugador A ataca al B, la vida del B será de 15. Pista: El método de ataque
cogera un objeto jugador como parametro.


*/

public class Main {

	public static void main(String[] args) {
		
		// 1. Empleando TDD 1
		int[] array=Array.oddsToArray(20);
		System.out.println(Arrays.toString(array));
		
		
		// 2. Java Keywords
		boolean b = JavaKeyword.containsJavaKeyword("Don't break my heart");
		System.out.println(b);
		
		
		// 3. Clase Jugador
		
		Warrior warrior= new Warrior(50,5,3,20);
		Elf elf=new Elf(25,2,10,40);
		Wizard wizard =new Wizard(40,6,3,60);
		
		System.out.println(warrior);
		System.out.println(elf);
		System.out.println(wizard);
		
		// 4. Empleando TDD 2
		
		
		
		// 5. Empleando TDD 3
		
	}

}
