package ejercicios.nonacces.deber;

public final class ClienteVIP extends Cliente{

	public final String horarioApertura= "06:00";
	public String datos="Codigo";
	
	public ClienteVIP() {
		//No se puede reescribir un atributo final
		horarioApertura = "06:40";
		datos="Cedula";
	}
}
