package consultorio.hospital;

import java.util.Scanner;

public class MainResgistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		Paciente paciente[] = new Paciente[4];
		
		Paciente paciente1 = new Paciente();
		String datos;

	do {	
		System.out.println("**********************");
		System.out.println("*****ELIJA UNA OPCION*******");
		System.out.println("1. Registra paciente");
		System.out.println("2. Imprimir reporte");
		System.out.println("3. SALIR");
		System.out.println("**********************");
		opcion = teclado.nextInt();
		
		if (opcion==1) {
			for (int i=0; i<5 ;i++ ) {
			System.out.println("Ingrese el nombre del paciente");
		    String name = teclado2.nextLine();
		    Paciente nombre = paciente[i];
		    paciente1.setNombre(name);
		    
			System.out.println("Ingrese el apellido del paciente");
			String nick = teclado2.nextLine();
			Paciente apellido = paciente[i];
			paciente1.setApellido(nick);
			
			System.out.println("Ingrese la edad del paciente");
			int age = teclado2.nextInt();
			Paciente edad = paciente[i];
			paciente1.setEdad(age);
			    
			System.out.println("Ingrese el sintoma del paciente");
			String sint = teclado2.nextLine();
			Paciente sintoma = paciente[i];
			paciente1.setSintoma(sint);
		
			}
			System.out.println("**********************");
			System.out.println("*****ELIJA UNA OPCION*******");
			System.out.println("1. Registra paciente");
			System.out.println("2. Imprimir reporte");
			System.out.println("3. SALIR");
			System.out.println("**********************");
			opcion = teclado.nextInt();
			}
		
		else if (opcion==2){
		
			System.out.println("**********************");
			System.out.println("*****ELIJA UNA OPCION*******");
			System.out.println("1. Registra paciente");
			System.out.println("2. Imprimir reporte");
			System.out.println("3. SALIR");
			System.out.println("**********************");
			opcion = teclado.nextInt();
		}
	
	}
	while (opcion==3);	
	opcion = teclado.nextInt();
	

	
	}
}
