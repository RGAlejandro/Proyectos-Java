package modelo;

import java.util.Calendar;

public class Reloj {

	public Reloj() {
		// TODO Auto-generated constructor stub
	}
	public static long ahora() {
		return Calendar.getInstance().getTimeInMillis();
	}
}
