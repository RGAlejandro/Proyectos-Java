package estudioOperadoresAritmeticos;

public class EstudioOperadoresAritmeticos {

	public EstudioOperadoresAritmeticos() {
		// TODO Auto-generated constructor stub
		System.out.println("Operadores Aritmeticos");
		
		int suma,a=-8,b=5,multi;
		double sumaDoble,num1=-8.6,num2=4.1;
		suma=a+b;
		multi=a*b;
		System.out.println("Suma = "+suma);
		System.out.println("Multiplicación = "+multi);
		sumaDoble=num1+a;
		suma=(int)sumaDoble;
		int divEntera, divid=7, div=3;
		double divReal,div2=3;
		divEntera=divid/div;
		System.out.println("Divi entera = "+divEntera);
		divReal=(int) (divid/(double)div);
		System.out.println("Div real ="+divReal);
		divReal=divid/div2;
		System.out.println("Div real 2 ="+divReal);
		int resto;
		resto=divid%div;
		System.out.println("El resto de la division es ="+resto);
		int cont=0;
		cont=cont+1; //contador
		System.out.println("Contador "+cont);//1
		cont++;
		System.out.println("Contador "+cont);//2
		++cont;
		System.out.println("Contador "+cont);//3
		int y=cont++;
		System.out.println("Contador "+y);//4 (deberia de valer 4 pero no vale 3), porque lo primero que lee es y=cont que en ese momento es 3 aunque luego se le sume uno
		y=++cont;
		System.out.println("Contador "+y);//5 (en este caso si que lee primero el cont y despues ve que y es igual cont que es 5)
		
		//contadores
		cont=cont+2;
		cont +=2;
		cont *=4; //cont= cont*4;
		cont/=2; //cont= cont/2;
		//los contadores son utiles para incrementar o decrecer una variable que se suele usar mucho en los bucles
		//acumaladores
		int acu=3;
		acu=acu+cont;
		acu+=cont;
		acu*=cont; // acu= acu*cont;
		//Un acumulador a diferencia de un contador en lugar de que su valor va cambiando, tu no sabes cual va a ser el valor
		// Operadores de relacion
		int z=3, r=4;
		boolean sw=false, sw1,sw2;//declaramos una variable en este caso sw como falso por defecto
		
		sw = z == r; 
		sw = z != r;
		sw = z >= r;
		System.out.println("sw =" +sw);
		
		sw1=true;
		sw2=false;
		
		//Operadores Lógicos
		System.out.println(!sw1); //! es NOT lo contrario a lo que valga sw1 que es true a false
		System.out.println(sw1 || sw2);//|| es equivalente al OR si uno de los 2 cumple es true
		System.out.println(sw1 && sw2); //&& es un AND o son los 2 true o es falso
		System.out.println(sw1 ^ sw2);//^ solo es true si uno de los 2 es true
		
		boolean a1 = true;
		boolean b1 = false;
		
		System.out.println("a= "+a1);
		System.out.println("b= "+b1);
		System.out.println("a && b= "+(a1 && b1));
		System.out.println("a || b= "+(a1 || b1));
		System.out.println("!a= " + !a1);
		System.out.println("a || (6 > 10)= "+ (a1 || (6 > 10)));
		System.out.println(((4 <= 4) || false && (!a1)));

		
		/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
		 * 	Examen de la asignatura **Programación** para obtener la media deseada
		 * 	Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la
		 * 	del segundo exmaen un 60%
		 */
		
	}

}
