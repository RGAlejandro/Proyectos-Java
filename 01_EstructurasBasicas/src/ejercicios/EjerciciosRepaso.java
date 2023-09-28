package ejercicios;

import java.util.Scanner;

public class EjerciciosRepaso {

	public EjerciciosRepaso() {
		// TODO Auto-generated constructor stub
		/*1. Introducir un número entero de dos dígitos por teclado. Si es positivo y tiene dos cifras,
		indicar cuánto suman sus dos dígitos; si no cumple esas condiciones, mostrar el mensaje:
		“No es positivo o no tiene dos cifras.”.*/
		/*Scanner leer=new Scanner(System.in);
		System.out.println("---------------------SUMA DE NUMERO DE 2 CIFRAS-----------------------");
		System.out.println("Introduce un numero de 2 cifras para que se sumen");
		int numPos=leer.nextInt();
		boolean numValido=true;
		numValido=(numPos>0 && numPos<100);
		if(numValido) {
		int dig1=numPos / 10;	
		int dig2=numPos % 10;
		int sumaDig=dig1 +dig2;
		System.out.println("Este numero es correcto su suma es: "+dig1+" y "+dig2+" es igual a "+sumaDig);
		}
		else {
		System.out.println("Este numero no es positivo o no tiene 2 cifras");	
		}*/
		
		
		/*2. Introducir un número entero por teclado. Si es positivo, entonces averiguad si es par o
		impar. Si es par, hallar si es múltiplo de 2, de 4 o de 8 y, en ese caso, mostrad el
		mensaje:”El número es par y múltiplo de 2 o de 4 o de 8". Si es impar, hallar si es múltiplo
		de 3, de 5 o de 7 y, en ese caso, mostrad el mensaje:”El número es impar y múltiplo de 3 o
		de 5 o de 7".*/
		/*System.out.println("---------------------CALCULA PAR O IMPAR Y SUS MULTIPLOS-----------------------");
		System.out.println("Escribe un numero para averiguar si es par o impar y ver sus multiplos");
		int numCalc=leer.nextInt();
		boolean EsImpar=true;
		boolean EsPar=true;
		EsImpar= numCalc%2==1;
		EsPar= numCalc%2==0;
		if(EsPar) {
		System.out.println(numCalc+ " es un numero PAR y sus multiplos son los siguientes:");
		if(numCalc%2==0) {
		System.out.println(numCalc+ " es multiplo de 2");
		}
		if(numCalc%4==0) {
		System.out.println(numCalc+ " es multiplo de 4");	
		}
		if(numCalc%8==0) {
		System.out.println(numCalc+ " es multiplo de 8");	
		}
		}
		if(EsImpar) {
		System.out.println(numCalc+ " es un numero IMPAR y sus multiplos son los siguientes:");	
		if(numCalc%3==0) {
		System.out.println(numCalc+ " es multiplo de 3");
		}
		if(numCalc%5==0) {
		System.out.println(numCalc+ " es multiplo de 5");	
		}
		if(numCalc%7==0) {
		System.out.println(numCalc+ " es multiplo de 7");	
		}
		}*/
		//ABRIA QUE MEJORARLO
		
		/*3. Introducir un número entero por teclado que se supone que es una hora del día. Indicar
		si corresponde a la mañana (entre las 6 y las 11, ambas inclusive), si es una hora de la
		tarde (entre las 12 y las 19, ambas inclusive), si es de la noche (entre las 20 y las 23,
		ambas inclusive), si es de la madrugada (entre las 0 y las 5, ambas inclusive) o bien, si no
		puede corresponder a una hora del día.*/
		/*System.out.println("---------------------PEDIR HORA Y TE DIGO-----------------------");
		int numHora=leer.nextInt();
		if(numHora <0 || numHora>24) {
		System.out.println("Lo siento esta hora no corresponde a una hora del dia");	
		}
		if(numHora>=0 && numHora<=5) {
		System.out.println("Hola buena madrugada");	
		}
		if(numHora>=6 && numHora<=11) {
		System.out.println("Hola buenos dias");	
		}
		if(numHora>=12 && numHora <=19) {
		System.out.println("Hola buenas tardes");		
		}
		if(numHora>=20 && numHora <=24) {
		System.out.println("Hola buenas noches");			
		}*/
		
		/*4. Introducir un número entero por teclado que se supone que es un mes del año. Si es así,
		indicar cuántos días tiene el mes que le antecede.*/
		/*System.out.println("---------------------NUMERO DE DIAS DE UN MES-----------------------");
		System.out.println("Introduce un numero que equivalga al numero del mes para saber los dias que tiene");
		int numMes=leer.nextInt();
		switch (numMes){
			case 1:
				System.out.println("Enero tiene un total de 31 dias");
				break;
			case 2:
				System.out.println("Febrero tiene un total de 28 dias");
				break;
			case 3:
				System.out.println("Marzo tiene un total de 31 dias");	
				break;
			case 4:
				System.out.println("Abril tiene un total de 30 dias");	
				break;
			case 5:
				System.out.println("Mayo tiene un total de 31 dias");	
				break;
			case 6:
				System.out.println("Junio tiene un total de 30 dias");	
				break;
			case 7:
				System.out.println("Julio tiene un total de 31 dias");	
				break;
			case 8:
				System.out.println("Agosto tiene un total de 31 dias");	
				break;
			case 9:
				System.out.println("Septiembre tiene un total de 30 dias");	
				break;
			case 10:
				System.out.println("Octubre tiene un total de 31 dias");	
				break;
			case 11:
				System.out.println("Noviembre tiene un total de 30 dias");	
				break;
			case 12:
				System.out.println("Diciembre tiene un total de 31 dias");
				break;
		}*/
		/*5. Introducir un número entero por teclado que se supone que es un año. Indicar si es
		bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. P.e.:
		“Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”).*/
		/*Scanner bisiesto=new Scanner(System.in);
		System.out.println("---------------------SABER SI UN AÑO ES BISIESTO O NO-----------------------");
		int numAño=bisiesto.nextInt();
		boolean esBisiesto=false;
		boolean esMultiCuatro,esMultiCuatrocientos,esMultiCien;
		esMultiCien=(numAño%100==0);
		esMultiCuatro=(numAño%4==0);
		esMultiCuatrocientos=(numAño%400==0);
		if(esMultiCuatro & ! esMultiCien) {
			System.out.println("Este año ES bisiesto ya que es divisible entre 4 y no es divisible entre 100");	
			esBisiesto=true;
		}
		else if (esMultiCuatrocientos){
			System.out.println("Este año ES bisiesto ya que es divisible entre 400");	
			esBisiesto=true;
		}
		else {
			System.out.println("El año no es bisiesto");
		}
		*/
		/*6. Mostrar los 20 números impares inmediatamente inferiores al 100, en orden decreciente,
		y al final, la suma de todos ellos.*/
		/*System.out.println("---------------------NUMEROS IMPARES DESDE 100 Y SU SUMA DE TODOS LOS IMPARES-----------------------");
		int contMenos=100;
		int contNums=0;
		int acumulaImpares=0;
		while(contNums<20) {
		if(contMenos%2==1) {
		System.out.println(contMenos);
		acumulaImpares+=contMenos;
		contNums++;
		}
		contMenos--;
		}
		System.out.println("La suma de los 20 numeros impares inferiores a 100 es "+acumulaImpares);*/
		//MIRAR EN CASA
		/*7. Introducir 20 números enteros por teclado. Indicar cuánto suman (en valor absoluto) los
		negativos, y cuánto los positivos.*/
		/*System.out.println("---------------------SUMA DE NUMEROS POSITIVOS Y SUMA CON NUMEROS NEGATIVOS-----------------------");
		System.out.println("Introduce 20 numeros y te dire la suma de los positivos y la de los negativos");
		int numIntro=0;
		int numVeces=0;
		int acumNumNegativo=0;
		int acumNumPositivo=0;
		while(numVeces<20) {
		numIntro=leer.nextInt();	
		if(numIntro <0) {
		acumNumNegativo+=numIntro;		
		}
		if(numIntro >=0) {
		acumNumPositivo+=numIntro;			
		}
		numVeces++;
		}
		System.out.println("La suma de los numeros positivos es: "+acumNumPositivo);
		System.out.println("La suma de los numeros negativos es: "+(acumNumNegativo*-1));*/
		/*8. Calcular la suma : 1 + 2 + 3 +.....+ 20. Luego, la suma : 1 + 3 + 5 +.....+ 51. Y, por último,
		la suma : 1 - 2 + 3 -.....+ 19 - 20.*/
		/*System.out.println("---------------------SUMAS EN BUCLES Y DE DIFERENTES MANERAS-----------------------");
		System.out.println("SUMA 1");//1+2+3+4+5+6+7+8... HASTA 2O
		int sum=0;
		for(int x=1;x<21;x++)
		sum+=x;
		System.out.println("La suma de 1+2+3+...20 ="+sum);
		System.out.println("SUMA 2");
		sum=0;
		for(int x=1;x<52;x+=2)
		sum+=x;
		System.out.println("La suma de 1+3+5+...51 ="+sum);
		System.out.println("SUMA 3");
		sum=0;
		int n=1,num;
		for(int x=1;x<21;x++){
		num=x*n;
		sum+=num;
		n*=-1;//n ira alternando los valores 1 y -1//n=n*(-1)//c+=2 c=c+2
		}
		System.out.println("La suma de 1-2+3-4...-20 ="+sum);
		}*/
		/*9. Introducir un número entero que llamaremos <dia_semana>, y comprendido entre 0 y 6,
		de modo que el 0 corresponderá al Domingo, el 1 al Lunes,...y así sucesivamente, hasta el
		6 que señalará al Sábado. Suponed que el 1o de Enero de un año cualquiera “cae” en el
		día que marca <dia_semana>. Tendréis que presentar en pantalla todos los días del mes
		de Enero, cada uno en una línea, acompañado del nombre del día de la semana que le
		corresponde.*/
		/*Scanner semanita=new Scanner(System.in);
		System.out.println("---------------------DIA DE LA SEMANA EN UN MES-----------------------");
		int numSemana=semanita.nextInt();
		for(int numMes=1;numMes<32;numMes++) {
		switch(numSemana) {
		case 0:
			System.out.println(numMes+" de Enero sería Domingo");
		case 1:
			System.out.println(numMes+" de Enero sería Lunes");
		case 2:
			System.out.println(numMes+" de Enero sería Martes");
		case 3:
			System.out.println(numMes+" de Enero sería Miercoles");
		case 4:
			System.out.println(numMes+" de Enero sería Jueves");
		case 5:
			System.out.println(numMes+" de Enero sería Viernes");
		case 6:
			System.out.println(numMes+" de Enero sería Sabado");
		}
		numSemana++;
		if(numSemana>6) {
			numSemana=0;
		}*/
		/*10. Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su sueldo
		neto mensual, y obtener y visualizar el nombre y sueldo de la persona que más cobra y de
		la que menos. Si hay varias con el mismo sueldo (máximo o mínimo) se presentará la
		primera que aparezca en la secuencia de entrada.*/
		/*Scanner leerCosa=new Scanner(System.in);
		System.out.println("---------------------MOSTRAR SUELDO MAS ALTO Y MAS BAJO DE UN EMPLEADO-----------------------");
		String dato;
		int salarioNeto=0;
		int salarioMayor=0;
		int salarioMenor=10000000;
		String nombreSalarioMayor = null;
		String nombreSalarioMenor;
		String nombre;
		int contVeces=0;
		while(contVeces<10) {
		nombre=leerCosa.next();
		salarioNeto=leerCosa.nextInt();
		if(salarioNeto>salarioMayor) {
		salarioMayor=salarioNeto;
		nombreSalarioMayor=nombre;
		}
		if(salarioNeto<salarioMenor) {
		salarioMenor=salarioNeto;
		nombreSalarioMenor=nombre;	
		}
		contVeces++;
		}
		System.out.println("El salario del empleado "+nombreSalarioMayor+ " es el mas alto y es de "+salarioMayor);*/
		
		/*11. Calcular la suma de los números pares y, al mismo tiempo, la de los impares
		comprendidos entre 1 y 100, ambos inclusive.*/
		/*System.out.println("---------------------SUMA DE NUMEROS PARES E IMPARES DEL 1 AL 100-----------------------");
		int contDec=100;
		int acumulaPares=0;
		int acumulaImpares=0;
		int sumaPares=0;
		int sumaImpares=0;
		while(contDec>0){
		if(contDec%2==0) {
		acumulaPares=contDec;
		sumaPares+=acumulaPares;
		System.out.print(acumulaPares+" + ");
		}
		else {
		acumulaImpares=contDec;
		sumaImpares+=acumulaImpares;
		}
		contDec--;	
		}
		System.out.println("La suma de todos los pares es= "+sumaPares);
		System.out.println("La suma de todos los impares es= "+sumaImpares);*/
		
		
		/*12. Dados dos números enteros positivos, hallar el mínimo común múltiplo. Método a usar:
		Se van hallando los sucesivos múltiplos del mayor de ellos hasta encontrar uno que sea
		divisible por el más pequeño.*/
		/*
		Scanner leerNums=new Scanner(System.in);
		System.out.println("---------------------MINIMO COMUN MULTIPLO DE 2 NUMEROS INTRODUCIDOS-----------------------");
		int mayor,menor,mcm;
		System.out.println("Introduzca el primer numero");
		menor=leerNums.nextInt();
		System.out.println("Introduzca el segundo numero");
		mayor=leerNums.nextInt();
		//hacemos el el mayor numero este en la variable mayor
		if(menor>mayor){
		int c=mayor;
		mayor=menor;menor=c;
		}
		int cont=1;
		System.out.print("El MCM de "+mayor+" y "+menor+" =");
		mcm=mayor;
		while(mcm%menor !=0){
		cont++;
		mcm=mayor*cont;
		}
		System.out.println(mcm);
		*/
		
		/*13. Dado un número entero positivo, calcular una lista de sus divisores, incluyendo a él
		mismo. Al final del proceso se deberá indicar cuántos divisores son pares y cuántos
		impares.
		*/
		/*Scanner listar=new Scanner(System.in);
		System.out.println("---------------------LISTA DE DIVISORES DE UN NUMERO ENTERO-----------------------");
		System.out.println("Introduce un numero entero positivo y te dire su lista de divisores, y cuantos son pares y cuantos impares");
		int numListado=listar.nextInt();
		int increDiv=1;
		int contPares=0;
		int contImpares=0;
		while(increDiv<=numListado) {
			if(numListado%increDiv==0) {
				System.out.println(increDiv+" es divisor de "+numListado);
				if(increDiv%2==0) {
					contPares++;
				}
				else {
					contImpares++;
				}
			}
			
			increDiv++;
		}
		System.out.println("En total hay estos divisores pares "+contPares+ " y estos divisores impares "+contImpares);*/
			
		//14. Dado un número entero positivo hallar si es primo o no.
		/*Scanner leern=new Scanner(System.in);
		System.out.println("---------------------CALCULAR SI UN NUMERO ES PRIMO O NO-----------------------");
		int numIntr=leern.nextInt();
		boolean EsPrimo=true;
		for(int contDiv=2;contDiv<(numIntr-1);contDiv++) {
			if(numIntr%contDiv==0) {
				EsPrimo=false;	
				break;
			}
		}
		if (EsPrimo) {
			System.out.println("Ese numero ES PRIMO");	
		}
		else {
			System.out.println("Ese numero NO ES PRIMO");	
		}
		*/
		/*15. Dado un número entero positivo, hallar los números primos comprendidos entre 2 y
		dicho número.*/
		/*Scanner primosleer=new Scanner(System.in);
		System.out.println("---------------------CALCULAR SI UN NUMERO ES PRIMO O NO EN UN INTERVALO-----------------------");
		int numInicio=2;
		System.out.println("Introduce el numero primo al que quieres llegar, se empieza desde el 2");
		int numFinal=primosleer.nextInt(); 
		EsPrimo(numInicio);
		int contDivi=2;
		boolean NoEsNumPrimo=true;	
		for(numInicio=2;numInicio<numFinal;numInicio++) {
			NoEsNumPrimo=EsPrimo(numInicio);
			if(NoEsNumPrimo) {	
				System.out.println(numInicio+" este numero ES PRIMO");
			}else {
				System.out.println(numInicio+" este numero NO ES PRIMO");}
		}
		*/
		
		/*16. Calcular el producto de dos números enteros positivos mediante el denominado
		"algoritmo ruso del producto": consiste en duplicar el primer factor y dividir (cociente
		entero) por 2 el segundo, obteniendo un producto equivalente, salvo si el segundo es
		impar, en cuyo caso es necesario acumular previamente el primero en donde se va a
		obtener el resultado. El proceso termina cuando el segundo factor se hace 0. Por ejemplo:
		25 * 6

		1ofactor 2ofactor Acumulador
		25 6 0
		50 3 50
		100 1 150
		200 0 150
		*/ 
		/*System.out.println("---------------------ALGORITMO RUSO DE UN PRODUCTO-----------------------");
		Scanner factores=new Scanner(System.in);
		System.out.println("introduce el primer factor (este se multiplica por 2");
		int factor1=factores.nextInt();
		System.out.println("introduce el segundo factor (este se divide entre 2");
		int factor2=factores.nextInt();
		int acumFactor=0;
		boolean numEsPar=true;
		boolean numEsImpar=true;
		numEsPar=factor2%2==0;
		numEsImpar=factor2%2!=0;
		if(numEsImpar) {
			acumFactor=factor1;
		}
		System.out.println("1ºFactor 2ºFactor Acumulador");
		while(factor2>=0) {
		System.out.println(factor1+" - "+factor2+" - "+acumFactor);	
		factor1*=2;
			if(numEsPar) {
				factor2/=2;
				if(factor2%2==1) {
					acumFactor+=factor1;	
				}
			}
			else {
				factor2/=2;
				acumFactor+=factor1;
			}
			
			if (factor2==0) {
				break;
			}
		}
		*/
		/*17. Visualizar todos los números binarios representables con 4 bits, ordenados de menor a
		mayor, así como su valor decimal.*/
		/*System.out.println("---------------------NUMEROS EN BINARIOS QUE SEAN HASTA 4 BITS Y AL LADO EN DECIMAL-----------------------");
		int numNormal=1;
		while(numNormal<=15) {
		System.out.println(numNormal+" en binario es= "+Integer.toBinaryString(numNormal));	
		numNormal++;
		}
		*/
		/*18. Calcular e visualizar las potencias de 2 -el exponente variará de 0 a 10- del siguiente
		modo:

		2 elevado a 0 es 1.
		2 elevado a 1 es 2.
		................
		2 elevado a 10 es 1024
		(NOTA: No usar la función de exponenciación – pow -)
		*/
		/*System.out.println("---------------------POTENCIAS DE 2 SIN FUNCION POW-----------------------");
		int numeroPot=2;
		int elevador=0;
		int acumulaResulPot=1;
		while(elevador<=10) {
			if(elevador==0) {
				System.out.println(numeroPot+" elevado a "+elevador+" = "+acumulaResulPot);	
			}
			else{
				acumulaResulPot*=numeroPot;
				System.out.println(numeroPot+" elevado a "+elevador+" = "+acumulaResulPot);	
			}
			
			elevador++;
		}
		*/
		//19. Introducir un número y desglosarlo de forma ideal en billetes y monedas de curso legal.
		/*Scanner leer =new Scanner(System.in);
		int b500=0,b200=0,b100=0,b50=0,b20=0,b10=0,b5=0,m2=0,m1=0;
		System.out.println("Introduzca una cantidad de dinero");
		int euros=leer.nextInt();
		int eur=euros;
		b500=eur/500;eur-=(500*b500);b200=eur/200;eur-=(200*b200);
		b100=eur/100;eur-=(100*b100);b50=eur/50;eur-=(50*b50);
		b20=eur/20;eur-=(20*b20);b10=eur/10;eur-=(10*b10);
		b5=eur/5;eur-=(5*b5);m2=eur/2;eur-=(2*m2);m1=eur/1;eur-=(1*m1);
		System.out.println(euros+" euros se descompone en :");
		if(b500>0)System.out.println(b500+" billetes de quinientos euros");
		if(b200>0)System.out.println(b200+" billetes de doscientos euros");
		if(b100>0)System.out.println(b100+" billetes de cien euros");
		if(b50>0)System.out.println(b50+" billetes de cincuenta euros");
		if(b20>0)System.out.println(b20+" billetes de veinte euros");
		if(b10>0)System.out.println(b10+" billetes de diez euros");
		if(b5>0)System.out.println(b5+" billetes de cinco euros");
		if(m2>0)System.out.println(m2+" monedas de dos euros");
		if(m1>0)System.out.println(m1+" monedas de un euros");

	}*/
		
		
		/*20. Calcula la suma de la progresión geométrica 1 + x + x
		2
		+ x
		3
		+ x
		4
		+ ....+ x
		n
		, siendo x y n

		valores enteros que se introducirán desde teclado.
		*/
		/*Scanner potenciar=new Scanner(System.in);
		System.out.println("---------------------SUMA DE PROGRESION GEOMETRICA-----------------------");
		int contPotencias=0;
		int sumaTotales=0;
		int acumulaSuma=0;
		System.out.println("Introduce el numero base que quieras poner");
		int numBase=potenciar.nextInt();
		System.out.println("Introduce el numero de vecez que se va a potenciar");
		int numVeces=potenciar.nextInt();
		while(contPotencias<=numVeces) {
			if(contPotencias==0) {
				System.out.print("1 + ");
			}
			else {
				acumulaSuma=((int)Math.pow(numBase, contPotencias));
				System.out.print(acumulaSuma+" + ");
			}
			contPotencias++;
			sumaTotales+=acumulaSuma;
		}
		sumaTotales=sumaTotales+1;
		System.out.print("= "+sumaTotales);
		}*/
		
		
		/*21. En la “Pensión de los números”, dirigida por el señor 0 (cero), residen desde hace
		meses el 8 y el 12. Una noche, cuando los tres habitantes de la casa se disponen a tomar
		una cena a base de “sopa de letras”, suena el timbre de la puerta. Se trata de un número
		entero que desea alojarse en la pensión.
		El Sr. 0 no tarda en invitar al nuevo número a sentarse en la salita, no sin decirle que,
		antes de admitirlo, debe comprobar que cumple una serie de requisitos.
		Los requisitos que, según el señor 0, debe cumplir un nuevo inquilino son los siguientes:
		- No debe ser primo. Para el Sr. 0 los números primos son muy presuntuosos.
		- Su factorial no puede exceder el billón, porque en caso contrario no entiende por qué no
		se aloja en el “Number Astoria”, el mejor hotel de la ciudad.
		- Y, por supuesto, no quiere que ninguno de sus inquilinos tenga actitudes “negativas” ante
		la vida.
		Así pues, el Sr. 0, tras estudiar al nuevo número, decide si lo admite o no en su pensión.
		Escribir un programa en C que simule lo anteriormente expuesto. Para ello se tomará
		desde teclado un número entero, que no podrá ser 0, ni 8, ni 12, y emitirá el mensaje

		“Bienvenido a la pensión” o “Lo siento, usted no cumple los requisitos”, según cumpla o no
		los condicionantes que el señor 0 considera imprescindibles para admitir a un nuevo
		huésped.*/
		/*
		Scanner numNuevo=new Scanner(System.in);
		System.out.println("---------------------NUMERO QUE ENTRARA EN LA PENSION DE NUMEROS-----------------------");
		System.out.println("Hola, soy el Sr.Zero, quiero saber que numero eres y dependiendo del que me digas te dejo pasar o no");
		int numeroNuevo=numNuevo.nextInt();
		int calcFactorial=1;
		boolean numValido=true;
		if(numeroNuevo>=0) {
			System.out.println("Este numero cumple la primera condicion, eres positivo asi me gusta ;)");	
		}
		else {
			System.err.println("Uff, que pena pero a mi las personas negativas como que no son lo mio");
			numValido=false;
		}
		
		if(numeroNuevo>=0) {
			for(int i=1;i<=numeroNuevo;i++) {
				calcFactorial*=i;
			}
			if(calcFactorial<100000000) {
				System.out.println("Tu numero factorial al ser menor a 1 billon te lo dire: "+numeroNuevo+"! = "+calcFactorial);	
			}
			else {
				System.err.println("Lo siento pero porque mejor no te vas a otro lado mucho mejor con tanto dinero(factorial mayor a 1B)");
				numValido=false;
			}
		}
		if(numeroNuevo>=0) {
			for(int cDiv=2;cDiv<numeroNuevo;cDiv++) {
				if(numeroNuevo%cDiv==0) {
				break;
				}
				else {
				numValido=false;
				
				}
			}
		}
		if(numValido) {
			System.out.println("Bienvenido "+numeroNuevo+" es un placer tenerte por aqui");
		}
		else {
			System.err.println("Lo siento "+numeroNuevo+" pero me da a mi que no vas a pasar");
		}
		*/
		
		/*22. El doctor 0, hermano gemelo del dueño de la “Pensión de los Números”, tiene una
		consulta a la cual llegan los ilusionados números padres, todos ellos “enteropositivos”, para
		averiguar las características de sus futuros “numeritos”.
		En el mundo de los números, todos los hijos cumplen que son máximos comunes divisores
		de sus padres. Para averiguarlo, el Dr. 0 dispone de un estrafalario aparato que le
		construyó su queridísimo amigo Euclides.
		El funcionamiento del aparato es el siguiente:
		“Aceptará dos números enteros positivos y obtendrá el resto de la división del
		mayor entre el menor. Si el resto se hace 0, el m.c.d. será el menor. Si no es así,
		se dividirá el mayor entre el resto de la última división realizada hasta que uno de
		los restos se haga nulo. El último divisor será el hijo de la pareja”.
		Escribir en C un programa que simule lo anteriormente expuesto. Para ello se tomarán
		desde teclado el padre y la madre de la criatura, ambos positivos, y se presentará en
		pantalla, aplicando el algoritmo de Euclides, el valor del máximo común divisor de ambos.
		Finalmente, se indicará si “se parece” (es igual) al padre (primer número introducido), a la
		madre (segundo número) o a ambos.*/	
		/*Scanner ultimo=new Scanner(System.in);
		int num1,num2,c,Dividendo,divisor,resto,cociente=0;
		System.out.println("Introduzca el primer numero");
		num1=ultimo.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2=ultimo.nextInt();
		if(num2>num1) {

		c=num2;
		num2=num1;
		num1=c;
		}
		Dividendo=num1;divisor=num2;
		while(Dividendo%divisor !=0) {
		resto=Dividendo%divisor;
		cociente=Dividendo/divisor;;
		Dividendo=divisor;
		divisor=resto;
		}
		System.out.println("El Maximo Comun Divisor ="+cociente);
		*/

	}
	

	private boolean EsPrimo(int numFinal) {
		// TODO Auto-generated method stub
	boolean NoEsNumPrimo=false;
	int contDivi=2;
	for(contDivi=2;contDivi<(numFinal);contDivi++) {
		NoEsNumPrimo=(numFinal%contDivi==0);
		if(NoEsNumPrimo) {	
			NoEsNumPrimo=true;
			return !NoEsNumPrimo;

		}else {
			NoEsNumPrimo=false;
		}
	}
	return !NoEsNumPrimo;	
	}

}
