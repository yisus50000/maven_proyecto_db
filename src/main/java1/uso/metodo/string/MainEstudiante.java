package uso.metodo.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner teclado = new Scanner(System.in);
		int selec;
		String cedula = "";

		Estudiante lista[] = new Estudiante[5];
		Estudiante cedula1 = new Estudiante();
		cedula1.setCedula(cedula);
		Estudiante cedula2 = new Estudiante();
		cedula2.setCedula(cedula);
		Estudiante cedula3 = new Estudiante();
		cedula3.setCedula(cedula);
		Estudiante cedula4 = new Estudiante();
		cedula4.setCedula(cedula);
		Estudiante cedula5 = new Estudiante();
		cedula5.setCedula(cedula);
		lista[0] = cedula1;
		lista[1] = cedula2;
		lista[2] = cedula3;
		lista[3] = cedula4;
		lista[4] = cedula5;

		do {
			System.out.println("*********************");
			System.out.println("*****ELIJA UNA OPCION*****");
			System.out.println("1. Ingresar Estudiante: ");
			System.out.println("2. Buscar Estudiante: ");
			System.out.println("3. SALIR");
			System.out.println("*********************");
			selec = teclado.nextInt();
			if (selec == 1) {
				System.out.println("Ingrese cedula del estudiante: ");
				cedula = teclado.nextLine();
				for (int i = 0; i == 0; i++) {
					lista[i] = cedula1;
				}
				for (int i = 0; i == 1; i++) {
					lista[i] = cedula2;
				}
				for (int i = 0; i == 2; i++) {
					lista[i] = cedula3;
				}
				for (int i = 0; i == 3; i++) {
					lista[i] = cedula4;
				}
				for (int i = 0; i == 4; i++) {
					lista[i] = cedula5;
				}
			} else if (selec == 2) {
				System.out.println("Ingrese cedula del estudiante: ");
				cedula = teclado.nextLine();
				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = lista[1];
					String cedulaObt = estudiante.getCedula();
					if (cedula.equals(cedulaObt)) {
						System.out.println("El estudiante a sido registrado");
					} else {
						System.out.println("El estudiante no ha sido registrado");
					}
				}
			}
		} while (selec != 3);
		selec = teclado.nextInt();
	}

}
