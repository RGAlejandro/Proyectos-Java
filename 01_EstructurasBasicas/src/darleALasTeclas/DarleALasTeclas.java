package darleALasTeclas;

import java.util.Scanner;

public class DarleALasTeclas {

	public DarleALasTeclas() {
		// TODO Auto-generated constructor stub
	//Calculame si un numero es PRIMO o no
	//System.out.println("-------------------------PROGRAMA QUE CALCULA SI NUMERO PRIMO----------------------------XXX");
	Scanner leerNum=new Scanner(System.in);//scanner para leer el numero
	/*
	System.out.println("Introduce un numero para decir si es primo o no");
	int num=0;//variable entera del numero que vamos a introducir
	boolean EsPrimo=true; //Variable boleana EsPrimo siendo true para que cuando no cumpla el bucle muestre que es Primo
	num=leerNum.nextInt();//Numero que queramos poner
	for(int contDiv=2;contDiv<num;contDiv++) { //bucle que se va a repetir hasta que el div sea num -1 y aumentara de 1 en 1
		if((num % contDiv)==0) {//Si esto ocurre significa que no es Primo, si no llega a entrar al if eso es que es primo porque lno ha dado la div el resto 0
			EsPrimo=false;
			break;
		}
	}//end for
	if(EsPrimo) {//como antes del bucle esta en true pues muestra que es verdadero si no entra en el if del bucle
		System.out.println("Este numero ES PRIMO");
	}//end if
	else {//cumplio el if se puso en false y directamente mira que no es primo
		System.out.println("Este numero NO ES PRIMO");
	}//end else
	System.out.println("");
	System.out.println("-------------------------PROGRAMA QUE CALCULA SI UN NUMERO ES PAR O IMPAR---------------------------XXX");
	System.out.println("Introduce un numero para decir si es PAR o IMPAR");
	int numIntro;
	boolean EsPar=true;
	numIntro=leerNum.nextInt();
	EsPar=numIntro%2==0;
	if(EsPar) {
		System.out.println("Este numero es Par");
	}else {
		System.out.println("Este numero es Impar");
	}//end else
	
	System.out.println("-------------------------PROGRAMA QUE LE DA LA VUELTA AL NUMERO---------------------------XXX");
	int numEscrito;//numero que metemos por teclado
	int volteado=0;//numero que sale cuando se le da la vuelta a numEscrito
	System.out.println("Escribe el numero que quieras darle la vuelta");
	numEscrito=leerNum.nextInt();//3796       6973
	while(numEscrito>0) {
		volteado=(volteado*10)+(numEscrito%10);	//me quedo el 6 que seria volteado
		numEscrito/=10;
	}//end while
	
	System.out.println("El numero que has introducido se escribe asi: "+volteado);
	System.out.println("");
	
	System.out.println("-------------------------PROGRAMA QUE TE DICE CUANTAS CIFRAS TIENE UN NUMERO---------------------------XXX");
	int numPuesto=0;
	System.out.println("Introduce un numero y te dire cuantas cifras tiene");
	numPuesto=leerNum.nextInt();//pones el numero que tu quieres descifrar
	int contCifras=0;//esta variable se encarga de contar las cifras cada vez que sale del bucle se le suma 1
	for(contCifras=0;numPuesto>0;contCifras++) {//bucle para saber cuantas cifras tiene el numero introducido
	numPuesto/=10;	//cada vez que se divide entre 10 sirve para quitar un numero y sustituirlo por una cifra
	}//end for
	System.out.println("El numero escrito tiene "+contCifras+ " cifras");
	
	System.out.println("-------------------------PROGRAMA QUE TE CALCULA EL METODO FIBONACCI---------------------------XXX");
	int num1=0;
	int num2=1;
	int suma=0;
	int numVeces;
	int acumulaNum=0;
	int acumulaNumFinal=0;
	System.out.println("Escribe el numero de veces que quieres hacer el metodo Fibonacci");
	numVeces=leerNum.nextInt();
	System.out.println(num1);
	System.out.println(num2);
	while(numVeces>=0) {
	suma=+(num1+num2);
	acumulaNum+=suma;
	System.out.println(acumulaNum);
	num1=acumulaNum;
	num2=suma;
	acumulaNumFinal=acumulaNum+num2;
	System.out.println(acumulaNumFinal);
	numVeces--;
		}//end while
	
	System.out.println("-------------------------PROGRAMA QUE TE DIGA NUMEROS QUE TU PONGAS DE 7 EN 7---------------------------XXX");
	int rango1=0;
	int rango2=0;
	int contadorSiete=0;
	System.out.println("Escribe el primer numero por el que quieres empezar el rango");
	rango1=leerNum.nextInt();
	System.out.println("Escribe el segundo numero por el que quieres terminar el rango");
	rango2=leerNum.nextInt();
	boolean rangoValido=true;
	rangoValido=rango1<rango2;
	if(rangoValido) {
		while(rango1<rango2) {
			contadorSiete=+7;	
			rango1+=contadorSiete;
			if(rango1<=rango2) {
				System.out.print(rango1+ "-");	
	}
	}//end while	
	}//end if
	else {
		System.out.println("Lo siento no puedo hacer eso ya que el numero1 es mas grande que el numero2");	
	}//end else
	
	System.out.println("-------------------------PROGRAMA QUE TE DIGA EL FACTORIAL DE UN NUMERO---------------------------XXX");
	int numFactorial=0;
	int acumuladorFactorial=0;
	int incrementadorFactorial=1;
	numFactorial=leerNum.nextInt();
	acumuladorFactorial=numFactorial;
	while(incrementadorFactorial<numFactorial) {
	acumuladorFactorial*=incrementadorFactorial;
	incrementadorFactorial++;
	}//end while
	System.out.println(numFactorial+"!= "+acumuladorFactorial);
	System.out.println("-------------------------PROGRAMA QUE TE DICE CUAL ES EL NUMERO MAS GRANDE DE LOS QUE INTRODUCE---------------------------");
	int numIntroduciones=0;
	int numMasGrande=0;
	System.out.println("Introduce un numero, si quieres acabar con el porgrama tienes que introducir un numero negativo");
	while (numIntroduciones>=0) {
	System.out.println("Introduce un numero positivo hasta que tu quieras acabar");	
	numIntroduciones=leerNum.nextInt();
	if(numIntroduciones>numMasGrande) {
		numMasGrande=numIntroduciones;	
	}//end if
	}//end while
	System.out.println("El numero mas grande y que sea positivo de los que has puesto es el "+numMasGrande);
	
	System.out.println("-------------------------PROGRAMA QUE TE CALCULA DEPENDIENDO SI ES PAR O IMPAR---------------------------");
	int numIntroducir=0;
	int maximoPar=0;
	int numContarNumeros=0;
	int contNumsImpares=0;
	int acumNumsImpares=0;
	boolean EsImpar=true;
	System.out.println("Escribe un numero, si quieres acabar con el programa escribe un numero negativo");
	do {
		numIntroducir=leerNum.nextInt();
		EsImpar=numIntroducir%2!=0;
		if (numIntroducir>=0) {
			numContarNumeros++;
			if  (EsImpar) {//numero impar
			contNumsImpares++;
			acumNumsImpares+=numIntroducir;
			}else {//numero par
			if (numIntroducir>maximoPar) {
			maximoPar= numIntroducir;	
			}
			}
		}
	}while (numIntroducir>=0);
	System.out.println("Se han introducido "+numContarNumeros+" numeros en total");
	System.out.println("La media de los numeros impares es "+acumNumsImpares /  contNumsImpares);
	System.out.println("El numero par mas grande es "+maximoPar);
	
	System.out.println("-------------------------PROGRAMA QUE TE DICE LA POSICION DE UN DIGITO INTRODUCIDO---------------------------");
	int numNormal=0;
	int voltearNumNormal=0;
	int digito=0;
	int posicionDigito=1;
	System.out.println("Introduce un numero entero: ");
	numNormal=leerNum.nextInt();
	
	System.out.println("Introduzca un digito que quiera saber la posicion");
	digito=leerNum.nextInt();
	
	System.out.println("Contando de izquierda a derecha el "+digito+" aparece dentro de "+numNormal+ " en las siguientes posiciones");
	
	//le da la vuelta al numero normal
	while(numNormal>0) {
	voltearNumNormal=(voltearNumNormal*10)+(numNormal%10);	
	numNormal/=10;
	}//end while
	
	//ahora comprobamos la posicion
	while (voltearNumNormal >0) {
	if (voltearNumNormal%10==digito) {
		System.out.print(posicionDigito+" ");
	}//end if
	voltearNumNormal/=10;//esto hace que quite el numero numero antes de entrar de nuevo en el nuevgo bucle
	posicionDigito++;//cada vez que hace el bucle se le suma una posicion al final del bucle para la proxima vez que entre
	}//end while
	
	System.out.println("-------------------------PROGRAMA QUE PONES LA HORA Y DEPENDERA LO QUE HAGAS---------------------------");
	System.out.println("FORMA SWITCH");
	int hora=leerNum.nextInt();
	switch(hora) {
	case 0: case 1: case 2: case 3: case 4: case 5:
		System.out.println("Buena Madrugadiña");
		break;
	case 6: case 7: case 8: case 9: case 10: case 11:
		System.out.println("Buenos Dias");
		break;
	case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
		System.out.println("Buenas Tardes");
		break;
	case 20: case 21: case 22: case 23: case 24:
		System.out.println("Buenas Noches");
		break;
		default: System.out.println("Introdcue un numero del 1 al 24 ");
	}
	System.out.println("FORMA IF");
	int horario=leerNum.nextInt();
	boolean numValidisimo=true;
	numValidisimo=horario >=0 && horario <=24;
	if(numValidisimo) {
		if(horario >=0 && horario<=5) {
			System.out.println("Hola buenisisima madrugada loco");
		}
		if(horario >=6 && horario <=11) {
			System.out.println("Hola Buenisimos Dias");
		}
		if(horario >=12 && horario <=19) {
			System.out.println("Buenas tardesita");
		}
		if(horario >=20 && horario <=24) {
			System.out.println("Buenas nochesita");
		}
	}
	else {
		System.err.println("Introduce una hora que se a correcta");
	}
	System.out.println("---------------------------ORDENAR NUMEROS---------------------------");
	int aux=0;
	System.out.println("Escribeme el numero 1");
	int numIntro1=leerNum.nextInt();
	System.out.println("Escribeme el numero 2");
	int numIntro2=leerNum.nextInt();
	if(num1>num2) {
		aux=num1;
		num1=num2;
		num2=aux;
	}
	System.out.print(num1+" - "+num2);
	*/
	/*System.out.println("---------------------------MINIMO COMUN MULTIPLO---------------------------");
	int auxi=0;
	int multi=1;
	int calcMCM=0;
	int resultado=0;
	System.out.println("Introduce el primer numero");
	int numMenor=leerNum.nextInt();
	System.out.println("Introduce el ultimo numero");
	int numMayor=leerNum.nextInt();
	if(numMenor>numMayor) {
		auxi=numMenor;
		numMenor=numMayor;
		numMayor=auxi;
	}
	while(multi>0) {
		calcMCM=numMayor*multi;
		if(calcMCM%numMenor==0) {
			resultado=calcMCM;
			break;
		}
		multi++;
	}
	System.out.println("El minimo comun multiplo es= "+resultado);
	*/
	/*
	System.out.println("---------------------------MAXIMO COMUN DIVISIDOR---------------------------");
	int divisor=0;
	int Dividendo=0;
	int aux=0;
	int resto=0;
	int cociente=0;
	System.out.println("introduce el primer numero");//este deberia de ser el mayor que nada mas empezar sería un Dividendo
	int numeroMayor=leerNum.nextInt();
	System.out.println("introduce el ultimo numero");//este deberia de ser el menor que nada mas empezar sería un divisor
	int numeroMenor=leerNum.nextInt();
	if(numeroMenor>numeroMayor) {//esto es para que numeromayor siempre sea el Dividendo o sino la div no se podria hacer
		aux=numeroMenor;
		numeroMenor=numeroMayor;
		numeroMayor=aux;
	}
	Dividendo=numeroMayor;
	divisor=numeroMenor;
	while(Dividendo%divisor !=0) {//entrara en el bucle cuando el resto no sea cero, si es cero se sale y hace la ultima div despues
		cociente=Dividendo/divisor;
		resto=Dividendo%divisor;
		Dividendo=divisor;
		divisor=resto;
	}
	cociente=Dividendo/divisor;//esta es la ultima div despues de salir del bucle esta div siempre ocurrira cuando el resto es 0
	System.out.println("el maximo comun divisor es= "+cociente);*/
/*	
	System.out.println("---------------------------CAJA FUERTE CON CONTRASEÑA---------------------------");
	int numIntrod=0;
	int intentos=3;
	boolean contraseñaValida=true;
	while(intentos>0) {
		System.out.println("Introduce la contraseña de la caja fuerte, (PISTA: Año de nacimiento)");
		numIntrod=leerNum.nextInt();
		contraseñaValida=numIntrod==2004;
		if(contraseñaValida) {//entrara cuando la variable numIntrod sea 2004
			System.out.println("Enhorabuena, has abierto la caja correctamente");
			break;
		}
		else {//si no es 2004 entonces restale un intento y que lo vuelva a repetir hasta que tenga 0 intentos
			intentos--;
			System.out.println("Lo siento esa contraseña no es correcta, te quedan "+intentos+" intentos");
		}
	}
	
System.out.println("---------------------------CALCULAR LOS MULTIPLOS DE UN NUMERO INTRODUCIDO---------------------------");
System.out.println("Escribe un numero para saber todos los muktiplos que tiene");
int numColo=leerNum.nextInt();
int contDiv=2;
System.out.println("Los multiplos de "+numColo+ " son:");
while(contDiv<=numColo) {
	if(numColo%contDiv==0){
		System.out.print(contDiv+" - ");
	}
	contDiv++;
}
*/
/*	
System.out.println("---------------------------SUMAS EN BUCLE DE DIFERENTES MANERAS---------------------------");
//Calcular la suma : 1 + 2 + 3 +.....+ 20. Luego, la suma : 1 + 3 + 5 +.....+ 51. Y, por último,
//la suma : 1 - 2 + 3 -.....+ 19 - 20.

System.out.println("---------------------------OPERACION1---------------------------");
int numBase=0;
int acumulaSuma1=0;
for(numBase=1;numBase<21;numBase++) {
	if(numBase==20) {
		acumulaSuma1+=numBase;
		System.out.print(numBase+"= "+acumulaSuma1);
	}
	else {
		System.out.print(numBase+" + ");
		acumulaSuma1+=numBase;
	}
}
System.out.println("");
System.out.println("---------------------------OPERACION2---------------------------");
numBase=0;
int acumulaSuma2=0;
for(numBase=1;numBase<52;numBase+=2) {
	if(numBase==51) {
		acumulaSuma2+=numBase;
		System.out.print(numBase+"= "+acumulaSuma2);
	}
	else {
		System.out.print(numBase+" + ");
		acumulaSuma2+=numBase;
	}
}
System.out.println("");
System.out.println("---------------------------OPERACION3---------------------------");
numBase=0;
boolean numEsPar=true;
int numPar=0;
int numImpar=0;
int acumulaPares=0;
int acumulaImpares=0;
for(numBase=1;numBase<21;numBase++) {
	numEsPar=numBase%2==0;
	if(numEsPar) {
		if(numBase==20) {
			numPar=numBase;
			numPar=(numPar*-1);
			acumulaPares-=numPar;
			int resultadoFinal=acumulaImpares-acumulaPares;
			System.out.print(" "+numPar+"= "+(resultadoFinal));
		}
		numPar=numBase;
		numPar=(numPar*-1);
		System.out.print(" "+numPar+" + ");
		acumulaPares-=numPar;
	}
	else {
		numImpar=numBase;
		System.out.print(numImpar);
		acumulaImpares+=numImpar;
	}
}
*/

//System.out.println("---------------------------ALGORITMO DE UN PRODUCTO RUSO---------------------------");	
/*1ofactor 2ofactor Acumulador
25 6 0
50 3 50
100 1 150
*/
/*	
int acumulador=0;
boolean numEsImpar=true;

System.out.println("Introduce un numero que actuara como factor 1");//este por cada vuelte que de se multiplica por 2
int factor1=leerNum.nextInt();
System.out.println("Introduce un numero que actuara como factor 2");//este por cada vuelte que de se dividira entre 2
int factor2=leerNum.nextInt();
System.out.println("1ofactor 2ofactor Acumulador");
numEsImpar=factor2%2!=0;
if(numEsImpar) {
	acumulador+=factor1;
}
System.out.println(factor1+" "+factor2+" "+acumulador);
while(factor2!=0) {
	factor1*=2;
	factor2/=2;
	numEsImpar=factor2%2!=0;
	if(numEsImpar) {
		acumulador+=factor1;
	}
	System.out.println(factor1+" "+factor2+" "+acumulador);
	}
*/
//System.out.println("---------------------------CALCULAR SI UN AÑO ES BISIESTO O NO---------------------------");
//P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”.
//P.e.: “Es bisiesto por ser múltiplo de 400”.
//P.e.: “No es bisiesto por ser múltiplo de 100”
//probar con el año 2000,2100,2004,2008
/*
int año=leerNum.nextInt();
boolean esBisiesto=false;
boolean esMultiplo400=true;
esMultiplo400=año%400==0;
boolean esMultiplo4=true;
esMultiplo4=año%4==0;
boolean esMultiplo100=true;
esMultiplo100=año%100==0;
if(esMultiplo400) {
	System.out.println("este numero ES BISIESTO por ser multiplo de 400");
	esBisiesto=true;
}
else if(esMultiplo4 && !esMultiplo100) {//este else if es clave, con que uno de los 2 if se cumplan ya no hace falta que lea el else, pero si fuese if normal, tendria que cumplir los 2 if para no leer el else
	System.out.println("este numero ES BISIESTO por ser multiplo de 4 y no de 100");
	esBisiesto=true;
}
else {
	System.err.println("Lo siento este numero no cumple ninguna condicion para ser bisiesto");
}
*/
/*
System.out.println("---------------------------CALENDARIO EMPIEZA DIA SEMANA QUE YO PONGA---------------------------");	
int diaMes=1;
int diaSemana=leerNum.nextInt();
while(diaMes<32) {
	switch (diaSemana) {
	case 0:
		System.out.println("Lunes "+diaMes+" de Enero");
		break;
	case 1:
		System.out.println("Martes "+diaMes+" de Enero");
		break;
	case 2:
		System.out.println("Miercoles "+diaMes+" de Enero");
		break;
	case 3:
		System.out.println("Jueves "+diaMes+" de Enero");
		break;
	case 4:
		System.out.println("Viernes "+diaMes+" de Enero");
		break;
	case 5:
		System.out.println("Sabado "+diaMes+" de Enero");
		break;
	case 6:
		System.out.println("Domingo "+diaMes+" de Enero");
		break;
	}
	
	diaMes++;
	
	diaSemana++;
	if(diaSemana>6) {
		diaSemana=0;
	}
}
*/
/*	
System.out.println("---------------------------SALARIO MAS ALTO Y EMNOS ALTO DE UN TRABAJADOR---------------------------");	
String nombreEmpleado=null;
String EmpleadoSalarioMayor=null;
String EmpleadoSalarioMenor=null;
int salarioEmpleado=0;
int salarioMayor=0;
int salarioMenor=10000000;
int contTrabajadores=0;
while(contTrabajadores<5) {
	System.out.println("introduce el nombre del empleado");	
	nombreEmpleado=leerNum.next();
	System.out.println("introduce salario del empleado");	
	salarioEmpleado=leerNum.nextInt();
	if(salarioEmpleado>salarioMayor) {
		salarioMayor=salarioEmpleado;
		EmpleadoSalarioMayor=nombreEmpleado;
	}
	if(salarioEmpleado<salarioMenor) {
		salarioMenor=salarioEmpleado;
		EmpleadoSalarioMenor=nombreEmpleado;
	}
	
	contTrabajadores++;	
}
System.out.println("El empleado "+EmpleadoSalarioMayor+ " es el que mas cobra con un salario de "+salarioMayor);
System.out.println("El empleado "+EmpleadoSalarioMenor+ " es el que mas cobra con un salario de "+salarioMenor);
*/
/*
System.out.println("---------------------------DESGLOSAMIENTO DE BILLETES---------------------------");	
int euros=leerNum.nextInt();
int b500=0, b200=0, b100=0, b50=0, b20=0, b10=0,b5=0,m2=0,m1=0;
int eur=0;
eur=euros;

b500=eur/500;eur-=(b500*500);
b200=eur/200;eur-=(b200*200);
b100=eur/100;eur-=(b100*100);
b50=eur/50;eur-=(b50*50);
b20=eur/20;eur-=(b20*20);
b10=eur/10;eur-=(b10*10);
b5=eur/5;eur-=(b5*5);
m2=eur/2;eur-=(m2*2);
m1=eur/1;eur-=(m1*1);
System.out.println("INSHALAH...");
if(b500>0)System.out.println(b500+" billetes de 500");
if(b200>0)System.out.println(b500+" billetes de 200");;
if(b100>0)System.out.println(b500+" billetes de 100");;
if(b50>0)System.out.println(b500+" billetes de 50");;
if(b20>0)System.out.println(b500+" billetes de 20");;
if(b10>0)System.out.println(b500+" billetes de 10");;
if(b5>0)System.out.println(b500+" billetes de 5");;
if(m2>0)System.out.println(b500+" monedas de 2");;
if(m1>0)System.out.println(b500+" monedas de 1");;
*/

}//end 	public

}//end class
