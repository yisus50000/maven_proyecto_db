package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Contains
		String frase = "Saquenme de Latinoamerica";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra = teclado.nextLine();
		
		boolean resultado = frase.contains(palabra);
		System.out.println("conntiene la palabra: " + resultado);
		
		//2. Equals
		
		System.out.println("******************************************************");
		String cadena1 = "Kiss";
		System.out.println("Ingrese la cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: "+ resultado2);
		
		//3,4. Upper, Lower
		System.out.println("******************************************************");
		String nombre = "marcelo";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula" + nombreEnMayuscula);
		
		System.out.println("******************************************************");
		String nombre2 = "MARCO";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println("Nombre en mayuscula" + nombreEnMinuscula);
	}

}
