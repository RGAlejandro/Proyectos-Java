package estudioClasesEnvoltorios;

public class ClasesEnvoltorios_Math {

	public ClasesEnvoltorios_Math() {
		// TODO Auto-generated constructor stub
	int x=123;
	int num;
	
	num=Integer.parseInt("2004");
	System.out.println(num);
	String numString=Integer.toString(x);
	System.out.println("Numero "+x+" como cadena :"+numString);	
	
	System.out.println("1111 en base 2= "+Integer.parseInt("1111",2));
	System.out.println("123456 en hexadecimal= "+Integer.toHexString(123456));
	System.out.println("167 en binario= "+Integer.toBinaryString(167));	
	char c='9';
	boolean sw=true;
	System.out.println("El caracter c es una letra?.. "+Character.isLetter(c));
	System.out.println("El caracter c es un digito?.. "+Character.isDigit(c));
	System.out.println("El caracter c es mayuscula?.. "+Character.isUpperCase(c));
	
	String numDouble="58.2324";
	double d=Double.parseDouble(numDouble);
	System.out.printf("La cadena %s es el numero %.3f %n",numDouble,d);
	
	String valorSw="true";
	sw=Boolean.parseBoolean(valorSw);
	System.out.println(Boolean.toString(sw));
	//System.out.println(sw);
	//LA CLASE MATH
	System.err.println("Math.ceil============================");//redondea por exceso
	System.out.println(Math.ceil(2.3));
	System.out.println(Math.ceil(0.895));
	System.out.println(Math.ceil(-1.87));
	System.out.println(Math.ceil(-0.9));
	System.err.println("Math.floor============================");//redondea para abajo(como truncar)
	System.out.println(Math.floor(2.8));
	System.out.println(Math.floor(0.895));
	System.out.println(Math.floor(-1.87));
	System.out.println(Math.floor(-0.9));
	System.err.println("Redondeos============================");//redondea si es mas que 5
	System.out.println(Math.rint(0.891));
	System.out.println(Math.rint(6.5));
	System.out.println(Math.rint(6.51));
	System.err.println("Potencias y raices============================");
	System.out.println(Math.pow(5,2));
	System.out.println(Math.sqrt(25));
	System.out.println(Math.pow(25,1/2.0));
	System.out.println(Math.pow(125, 1/3.0));
	
	System.err.println("Trigonometria============================");
	int angulo=30;
	System.out.println(Math.sin(Math.toRadians(angulo)));
	System.out.printf("El seno de un angulo de %d grados es = %.1f %n",
		angulo,Math.sin(Math.toRadians(angulo)));
	double cosAngulo=0.86;
	System.out.printf("Un coseno de %.2f corresponde a un angulo de %f %n",
			cosAngulo,Math.toDegrees(Math.acos(cosAngulo)));
	System.err.println("max de ds numeros=========");
	System.out.println(Math.max(3, 14));
	
	System.err.println("Aleatorios================");
	System.out.println(Math.random());
	int ale=0;
	for(x=0;x<10;x++) {
	ale=(int) Math.floor(Math.random()*5);
	System.out.print(ale+"-");
	}//end for
	System.out.println();
	for(x=0;x<10;x++) {
	ale=(int) Math.floor(Math.random()*10+1);
	System.out.print(ale+"-");
	}//end for
	System.out.println();
	int menor=5 , mayor=7;
	for(x=0;x<10;x++) {
	ale=(int) Math.floor(Math.random()*(mayor-menor+1)+menor);
	System.out.print(ale+"-");
	}
	}//end public

}//end class
