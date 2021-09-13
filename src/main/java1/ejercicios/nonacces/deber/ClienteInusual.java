package ejercicios.nonacces.deber;

public class ClienteInusual extends ClienteUsual {

	//No se puede sobreescribir un metodo final del padre
	//deben tener la misma firma
		protected void Datos() {
			System.out.println("No da sus datos");
		
		}
		
		protected void compraDirecta() {
		System.out.println("No recibe bonos y es un compra directa");

		}
}
