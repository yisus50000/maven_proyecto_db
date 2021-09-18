package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// el switch hasta antes de la version 1.7 solo funcionaba para byte, short
		// ,char e int
		String opcion;
		do {
			System.out.println("Escoja opcion: ");
			System.out.println("1. Realizar Transferencia ");
			System.out.println("2. Consultar pagos ");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese numero de cuenta: ");
				break;

			case "2":
				System.out.println("Ingrese numero de cuenta: ");
				break;
				
			case "3":
			System.out.println("Cerrando el sistema");
			break;
			
			default:
				System.out.println("Elija una opcion valida");
				break;
			}
		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}
}
