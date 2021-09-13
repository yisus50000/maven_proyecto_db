package ejercicios.nonacces.deber;

// No se puede Heredar de una clase final
public class ClienteUsual extends ClienteVIP {

	protected final void Datos() {
		System.out.println("Decide si dar o no sus datos");
	}
	protected void compraDirecta() {
		System.out.println("Recibe bonos por ser cliente usual");
	}
}


