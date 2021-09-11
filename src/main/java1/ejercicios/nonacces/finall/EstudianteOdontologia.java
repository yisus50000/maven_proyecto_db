package ejercicios.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina  {
    
	//No se puede sobreescribir un metodo final del padre
	//deben tener la misma fima
	protected void realizarPracticas() {
		System.out.println("Realiza 100 horas de practica");
	
	}
	
	protected void realizarPasantias() {
	System.out.println("Realiza 200 horas de practica");

	}
}
