package estudioPOO;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudioFechas {

	public EstudioFechas() {
		// TODO Auto-generated constructor stub
		LocalDate fecha=LocalDate.now();
		
		System.out.println("Fecha actual:"+fecha);
		
		try {
			fecha=LocalDate.of(2023, 2, 24);
			System.out.println("Fecha int yyyy MM dd:"+fecha);
			LocalDate fecha2=LocalDate.parse("2023-02-25");
			System.out.println("Fecha String:"+fecha2);
			//si ponemos MM el mes tiene que tener 2 digitos, igual con la fecha
			DateTimeFormatter FOMATTER=DateTimeFormatter.ofPattern("yyyy/M/d");
			LocalDate fecha3=LocalDate.parse("2015/10/2", FOMATTER);
			System.out.println("Fecha Formateada:"+fecha3);
		}catch (DateTimeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println(fecha.getYear());
		System.out.println(fecha.getMonthValue());
		System.out.println(fecha.getDayOfMonth());
		
		LocalDateTime fecha_y_Hora=LocalDateTime.now();
		System.out.println("Fecha y hora actual: "+fecha_y_Hora);
		fecha_y_Hora=LocalDateTime.of(2022, 10, 15, 15, 30);
		System.out.println("Fecha y hora int: "+fecha_y_Hora);
		fecha_y_Hora=LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println("Fecha y hora actual 2: "+fecha_y_Hora);
	}

}
