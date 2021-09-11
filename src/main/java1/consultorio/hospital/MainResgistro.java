package consultorio.hospital;

import java.util.Arrays;
import java.util.Scanner;

public class MainResgistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		Paciente paciente[] = new Paciente[4];
		String datos;
		int age;
		
		Paciente paciente1 = new Paciente();
		paciente1.setNombre(datos);
		paciente1.setApellido(datos);
		paciente1.setEdad(age);
		paciente1.setSintoma(datos);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNombre(datos);
		paciente2.setApellido(datos);
		paciente2.setEdad(age);
		paciente2.setSintoma(datos);
		
		Paciente paciente3 = new Paciente();
		paciente3.setNombre(datos);
		paciente3.setApellido(datos);
		paciente3.setEdad(age);
		paciente3.setSintoma(datos);
		
		Paciente paciente4 = new Paciente();
		paciente4.setNombre(datos);
		paciente4.setApellido(datos);
		paciente4.setEdad(age);
		paciente4.setSintoma(datos);
		
		Paciente paciente5 = new Paciente();
		paciente5.setNombre(datos);
		paciente5.setApellido(datos);
		paciente5.setEdad(age);
		paciente5.setSintoma(datos);
		
	do {	
		System.out.println("**********************");
		System.out.println("*****ELIJA UNA OPCION*******");
		System.out.println("1. Registra paciente");
		System.out.println("2. Imprimir reporte");
		System.out.println("3. SALIR");
		System.out.println("**********************");
		opcion = teclado.nextInt();
		
		if (opcion==1) {
			for (int i=0; i<paciente.length ;i++ ) {
			System.out.println("Ingrese el nombre del paciente");
		    datos = teclado2.nextLine();
		    
			System.out.println("Ingrese el apellido del paciente");
			datos = teclado2.nextLine();
			
			System.out.println("Ingrese la edad del paciente");
			age = teclado2.nextInt();
			
			System.out.println("Ingrese el sintoma del paciente");
			datos = teclado2.nextLine();
			
			paciente [i] = datos; 
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
			
				Arrays.sort(paciente);
	       System.out.println("Los pacientes son: ");
	        System.out.println(Arrays.toString(paciente));
	        
			
		}
	
	}
	while (opcion==3);	
	opcion = teclado.nextInt();
	
	paciente[0]=paciente1;	
	paciente[1]=paciente2;
	paciente[2]=paciente3;
	paciente[3]=paciente4;
	paciente[4]=paciente5;
	


	}
}
