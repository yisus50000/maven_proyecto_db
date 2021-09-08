package uso.metodo.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner teclado = new Scanner(System.in);
		int selec;
		String cedula;
		Estudiante cedula1 = new Estudiante();
		cedula1.setCedulaGuardada(cedula);
		Estudiante cedula2 = new Estudiante();
		cedula2.setCedulaGuardada(cedula);
		Estudiante cedula3 = new Estudiante();
		cedula3.setCedulaGuardada(cedula);
		Estudiante cedula4 = new Estudiante();
		cedula4.setCedulaGuardada(cedula);
		Estudiante cedula5 = new Estudiante();
		cedula5.setCedulaGuardada(cedula);
		Estudiante estudiante[] = new Estudiante[5];
		estudiante[0] = cedula1;
		estudiante[1] = cedula2;
		estudiante[2] = cedula3;
		estudiante[3] = cedula4;
		estudiante[4] = cedula5;
		do {
			System.out.println("*********************");
			System.out.println("*****ELIJA UNA OPCION*****");
			System.out.println("1. Ingresar Estudiante: ");
			System.out.println("2. Buscar Estudiante: ");
			System.out.println("3. SALIR");
			System.out.println("*********************");
			selec = teclado.nextInt();
			cedula = teclado.nextLine();

			if (selec == 1) {
				System.out.println("Ingrese cedula del estudiante: ");
				cedula = teclado.nextLine();
				for (int i = 0; i < 5; i++) {
					estudiante estudiantec = estudiante[1];
					String cedula = estudiante.getCedula;
				}
			} else if (selec == 2) {
				System.out.println("Ingrese cedula del estudiante: ");
				String cadena1 = cedula;
				String cadena2 = teclado.nextLine();
				boolean resultado = cadena1.equals(cadena2);
				System.out.println("La cedula es: " + resultado);

			} else if (selec == 3) {
				System.out.println("Hasta Pronto");
				selec = teclado.nextInt();
			}

		} while (selec == 3);
		selec = teclado.nextInt();

	}

}
