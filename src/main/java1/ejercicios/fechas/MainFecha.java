package ejercicios.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();//Deprecada y ya no se deberia usar
		
		LocalDate diaHoy = LocalDate.now(); //obtener fecha actual
		LocalDate diaFin = diaHoy.plusDays(15);//Aumentar 15 dias
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Bolley Principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		
		System.out.println(curso1.getNombre());
		System.out.println("Fecha de inicio: " + curso1.getFechaInicio());	
		System.out.println("Fecha de Finalizacion: " + curso1.getFechaFin());
		
		LocalDate diaHoy2 = LocalDate.now(); 
		LocalDate diaInicio = diaHoy2.minusDays(2);
		LocalDate diaFinaliza = diaInicio.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natacion Principiantes");
		curso2.setFechaInicio(diaInicio);
		curso2.setFechaFin(diaFinaliza);
		
		System.out.println(curso2.getNombre());
		System.out.println("Fecha de inicio: " + curso2.getFechaInicio());	
		System.out.println("Fecha de Finalizacion: " + curso2.getFechaFin());
		
		
		//Fechas Especificas
		LocalDate fechaEspecifica = LocalDate.of(2022, 2, 15);
		System.out.println(fechaEspecifica);
		
		//Ejercicios 
		LocalDate fechaEspecifiIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspecifiFin = LocalDate.of(2022, 7, 10);
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate ");
		curso3.setFechaInicio(fechaEspecifiIni);
		curso3.setFechaFin(fechaEspecifiFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println(curso3.getNombre());
		System.out.println("Fecha de inicio: " + curso3.getFechaInicio());	
		System.out.println("Fecha fin formato: " + curso3.getFechaFin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDate diaHoy3 = LocalDate.now();
		
		System.out.println("Que dia es hoy: " + diaHoy3.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
		System.out.println("Que dia es hoy: " + diaHoy3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
