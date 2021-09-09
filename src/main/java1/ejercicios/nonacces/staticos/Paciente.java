package ejercicios.nonacces.staticos;

public class Paciente {
	public static String nombre;
	private int edad;
	private static String nacionalidad = "Ecuatoriano";
	private static int edadLimite = 65;

	public void registrar(String nombre) {
		System.out.println("Se registra al paciente");
	}

	private static void consultarNacionalidad() {
		System.out.println("");
	}

	public void consultarNacionalidadEstatica() {
		System.out.println("La nacionalidad de  " + nombre + " es: " + nacionalidad);
	}
//Metodos SET Y GET

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Paciente.nombre = nombre;
	}

	public static int getEdadLimite() {
		return edadLimite;
	}

	public static void setEdadLimite(int edadLimite) {
		Paciente.edadLimite = edadLimite;
	}

}
