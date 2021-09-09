package uso.metodo.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		int selec;
		int num = -1;

		Estudiante lista[] = new Estudiante[5];

do {
			System.out.println("**********************");
			System.out.println("*****ELIJA UNA OPCION*******");
			System.out.println("1. Ingresar estudiante");
			System.out.println("2. Buscar estudiante");
			System.out.println("3. SALIR");
			System.out.println("**********************");
			selec = teclado.nextInt();
			if (selec == 1) {
				System.out.println("Ingrese cedula del estudiante: ");
				String datos = teclado1.nextLine();
				Estudiante estudiante = new Estudiante();
				estudiante.setCedula(datos);
				num = num +1;
				lista[num] = estudiante;
				
				System.out.println("**********************");
				System.out.println("*****ELIJA UNA OPCION*******");
				System.out.println("1. Ingresar estudiante");
				System.out.println("2. Buscar estudiante");
				System.out.println("3. SALIR");
				System.out.println("**********************");
				selec = teclado.nextInt();
				
			}
			if (selec == 2) {
				System.out.println("Ingrese cedula del estudiante: ");
				String datos1 = teclado1.nextLine();
				boolean respuesta = false;
				for (int i = 0; i < 5; i++) {
					Estudiante datocomparar = lista[i];
					String cedulaDelEstudiante = datocomparar.getCedula();
					boolean respuestaL = cedulaDelEstudiante.equals(datos1);
					if (respuestaL == true) {
						respuesta = true;
					}
				}
				if (respuesta == true) {
					System.out.println("El estudiante si se ha encontrado");
					System.out.println("**********************");
					System.out.println("*****ELIJA UNA OPCION*******");
					System.out.println("1. Ingresar estudiante");
					System.out.println("2. Buscar estudiante");
					System.out.println("3. SALIR");
					System.out.println("**********************");
					selec = teclado.nextInt();	
				} else {
					System.out.println("El estudiante no se ha encontrado");
					System.out.println("**********************");
					System.out.println("*****ELIJA UNA OPCION*******");
					System.out.println("1. Ingresar estudiante");
					System.out.println("2. Buscar estudiante");
					System.out.println("3. SALIR");
					System.out.println("**********************");
					selec = teclado.nextInt();
				}
			}
}while (selec==3);
System.out.println("Tenga un buen dia");
}

	@Override
	public String toString() {
		return "MainEstudiante [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

