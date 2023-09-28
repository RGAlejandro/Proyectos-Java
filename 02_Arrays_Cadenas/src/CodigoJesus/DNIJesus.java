package CodigoJesus;

public class DNIJesus {

	public DNIJesus() {
		// TODO Auto-generated constructor stub
		String dni = "52339371L";
		boolean dniCorrecto = compruebaDni(dni);
		if (dniCorrecto)
		System.out.println("DNI correcto");
		else
		System.err.println("DNI incorrecto");

		}
		private boolean compruebaDni(String dni) {
		// TODO Apéndice de método generado automáticamente
		boolean dniCorrecto = true;
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		dni = dni.toUpperCase();
		if (dni.length() == 9) {
		String numeroDNI = dni.substring(0, 8);
		for (int x = 0; x < numeroDNI.length(); x++) {
		char c = numeroDNI.charAt(x);
		if (!Character.isDigit(c))
		return false;

		}
		char letra = dni.charAt(8);
		System.out.println(numeroDNI + "-" + letra);
		int numDni = Integer.parseInt(numeroDNI);
		int resto = numDni % 23;
		char letraDni = letrasDNI.charAt(resto);
		System.out.println("---" + letraDni + "-----");
		if (letra != letraDni)
		dniCorrecto = false;

		} else {
		dniCorrecto = false;
		}
		return dniCorrecto;
		}
	}


