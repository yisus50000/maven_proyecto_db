package taller.prueba.correccion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoint = new Scanner(System.in);
		String clave;
		String opcion;
		int saldo = 1000;
		do {
			System.out.println("Ingrese clave: ");
			clave = teclado.nextLine();
			if (clave.equals("85AB")) {// si
				do {
					System.out.println("#########################");
					System.out.println("****BANCO PRODUBANCO****");
					System.out.println("Elija una opcion: ");
					System.out.println("1. Realizar Transferencia");
					System.out.println("2. Consultar Transacciones");
					System.out.println("3. SALIR");
					System.out.println("#########################");
					opcion = teclado.nextLine();
					// todo lo que me pide la opcion 1
					if (opcion.equals("1")) {
						System.out.println("Ingrese la cuenta de destino: ");
						String cuenta = teclado.nextLine();
						System.out.println("Ingrese el monto a transferir: ");
						int monto = tecladoint.nextInt();
						saldo = saldo - monto;
						System.out.println("Su nuevo saldo es: " + saldo);
						// todo lo que me pide la opcion 2
					} else if (opcion.equals("2")) {
						System.out
								.println("“En este momento se están procesando las transacciones, intente más tarde”");
					}
					// while (opcion.equals("1") || opcion.equals("2"));
				} while (!opcion.equals("3"));

			} else {// no
				System.out.println("La clave no es la correcta");
			}
		} while (!clave.equals("-1"));
		System.out.println("gracias por preferirnos");
	}
}
