package ejercicios;

import java.util.Scanner;

public class EjerciciosSentenciasCondicionalesP2 {

	public EjerciciosSentenciasCondicionalesP2() {
		// TODO Auto-generated constructor stub
		//7-Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
				System.out.println("Escribe un numero entero y te dire su ultimo numero");
				Scanner leerNumEntero=new Scanner(System.in);
				int div=10;
				int numEntero=leerNumEntero.nextInt();
				int division;
				division=numEntero%div;
				System.out.println("El resultado es "+division);
				
				/*8- Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten
				números de hasta 5 cifras.*/
				System.out.println("Escribe un numero de hasta 5 cifras y te digo el primer numero");
				Scanner leerNumCifras=new Scanner(System.in);
				int dividir;
				int num=leerNumCifras.nextInt();
				if (num >=0 && num <10){//numero de 1 cifra
					 System.out.println("El primer numero es "+num);
				}
				else if(num ==10 || num>10 && num<100) {//numero 10 o de 2 cifras
					dividir=num/10;
					System.out.println("El primer numero es "+dividir);
				}
				else if(num==100 || num >100 && num <1000){//Numero 100 o de 3 cifras
					dividir=num/100;
					System.out.println("El primer numero es "+dividir);
				}
				else if(num ==1000 || num >1000 && num <10000){//Numero 1000 o de 4 cifras
					dividir=num/1000;
					System.out.println("El primer numero es "+dividir);
				}
				else if(num ==10000 || num>10000 && num <100000){//Numero 10000 o de 5 cifras
					dividir=num/10000;
					System.out.println("El primer numero es "+dividir);
				}
				else {
					System.out.println("Lo siento ese numero tiene mas de 5 cifras o no esta correcto");
				}
				
				/*9- Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se
				permiten números de hasta 5 dígitos.*/
				System.out.println("Escribe un numero de hasta 5 cifras y te diré cuantas cifras tiene");
				Scanner leerNumTipo=new Scanner(System.in);
				int numEscrito=leerNumTipo.nextInt();
				int resultado;
				int cifras;
				if (numEscrito<0) {
					numEscrito=numEscrito *-1;
				}
				if(numEscrito >=0 && numEscrito <10) {
					cifras=1;
					System.out.println("El numero de cifras es "+cifras);
				}
				if(numEscrito >=10 && numEscrito <100) {
					cifras=2;
					System.out.println("El numero de cifras es "+cifras);
				}
				if(numEscrito >=100 && numEscrito <1000) {
					cifras=3;
					System.out.println("El numero de cifras es "+cifras);
				}
				if(numEscrito >=1000 && numEscrito <10000) {
					cifras=4;
					System.out.println("El numero de cifras es "+cifras);
				}
				if(numEscrito >=10000 && numEscrito <100000) {
					cifras=5;
					System.out.println("El numero de cifras es "+cifras);
				}
				
				/*10-Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten
				números de hasta 5 cifras.*/
				System.out.println("Escribeme un numero y te dire si es Capicua o no");
				Scanner numCapicua=new Scanner(System.in);
				int numEscribir=numCapicua.nextInt();
				int resto;
				int div1,div2,div3,div4;
				if(numEscribir >=0 && numEscribir<10) {//numeros de 1 cifra
					System.out.println("Este numero es capicúa");
				}
				if(numEscribir >=10 && numEscribir<100) {//numeros de 2 cifras
					resto=numEscribir%11;
					if(resto==0){
						System.out.println("Este numero es capicúa");
					}else {
						System.out.println("Este numero no es capicúa");
					}
				}
				if(numEscribir >=100 && numEscribir <1000){//numero de 3 cifras
					div1=numEscribir%10;
					div2=numEscribir/100;
					if(div1==div2){
						System.out.println("Este numero es capicúa");
					}else {
						System.out.println("Este numero no es capicúa");
					}
				}
				if(numEscribir >=1000 && numEscribir <10000){//numero de 4 cifras
					div1=numEscribir%10;
					div2=numEscribir/1000;
					div3=numEscribir%100;
					div4=numEscribir/100;
					
					if(div1==div2 && div3==div4){
						System.out.println("Este numero es capicúa");
					}else {
						System.out.println("Este numero no es capicúa");
					}
				}
				if(numEscribir >=10000 && numEscribir <100000){//numero de 5 cifras
					
				}
				/*11- Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de
				impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA
				general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser
				nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la
				mitad, se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos,
				aunque los números no estén tabulados.*/
				System.out.println("Calcula precios con IVAS y descuentos");
				System.out.println("Escribe la base imponible del producto");
				Scanner precio=new Scanner(System.in);
				int baseImponible=precio.nextInt();
				int iva=0;
				int sumaIva=0;
				int baseIva=0;
				int baseFinal=0;
				System.out.println("Escribe el tipo de IVA que quiere aplicar, esta el general, reducido y superreducido");
				String tipoIva=precio.next();
				
				switch (tipoIva){
				case "general":
				iva=21;
				sumaIva=(baseImponible*iva)/100;
				baseIva=baseImponible+sumaIva;
				System.out.println("El precio con IVA general es de "+baseIva);
				break;
				case "reducido":
					iva=10;
					sumaIva=(baseImponible*iva)/100;
					baseIva=baseImponible+sumaIva;
					System.out.println("El precio con IVA general es de "+baseIva);
					break;
				case "superreducido":
					iva=4;
					sumaIva=(baseImponible*iva)/100;
					baseIva=baseImponible+sumaIva;
					System.out.println("El precio con IVA general es de "+baseIva);
					break;
				}
				System.out.println("¿Quieres añadir algun codigo de promocion? (Ponga mitad,meno5 o 5porc si es Si y nopro es No)");
				String respuestaCodPromo=precio.next();
				switch (respuestaCodPromo) {
				case "nopro":
				baseFinal=baseIva;	
				System.out.println("Vale, como no tienes codigo de promocion el producto sigue valiendo "+baseFinal);
				break;
				case "mitad":
				baseFinal=baseIva/2;
				System.out.println("Vale, has usado el codigo de mitad de precio ahora el producto vale "+baseFinal);
				break;
				case "meno5":
				baseFinal=baseIva-5;
				System.out.println("Vale, has usado el codigo que te resta 5€ ahora el producto vale "+baseFinal);
				break;
				case "5porc":
				baseFinal=(baseIva*95)/100;
				
				System.out.println("Vale, has usado el codigo que te resta 5% ahora el producto vale "+baseFinal);
				break;
				default: System.out.println("Pon un codigo de promocion que sea valido");
				}
				System.out.println("Producto en Base Imponible "+baseImponible+" Producto con IVA "+baseIva+" Producto despues del uso del Codigo de Promoción "+baseFinal);
				
				
				/*12- Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
					• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto), los días que ha estado de
					viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
					• El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata d e un prog. junior, un prog. senior o un
					jefe de proyecto respectivamente.
					• Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto hay que restarle
					el IRPF, que será deun 25% en caso de estar soltero y un 20% en caso de estar casado.
					Ejemplo:
					1 - Programador junior
					2 - Prog. senior
					3 - Jefe de proyecto
					Introduzca el cargo del empleado (1 - 3): 2
					¿Cuántos días ha estado de viaje visitando clientes? 5
					Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
					----------------------------------
					| Sueldo base 1200,00 |
					| Dietas ( 5 viajes) 150,00 |
					|--------------------------------|
					| Sueldo bruto 1350,00 |
					| Retención IRPF (20%) 270,00 |
					|--------------------------------|
					| Sueldo neto 1080,00 |
					----------------------------------*/
				
				System.out.println("¿Que clase de programador eres? (1-Prog.junior, 2-Prog.senior, 3-JefeProyecto)(1-3)");
				Scanner trabajo=new Scanner(System.in);
				int sueldoBase=0;
				int numIrpf=0;
				int irpf=0;
				int sueldoBaseNeto=0;
				int sueldoBaseSumado=0;
				int dineroVac=0;
				int precioDia=30;
				int restadoIrpf=0;
				int numProf=trabajo.nextInt();
				switch (numProf) {
				case 1:
					sueldoBase=950;
					
					break;
				case 2:
					sueldoBase=1200;
					
					break;
				case 3:
					sueldoBase=1600;
					
					break;
					default:
					System.out.println("Escribe un numero del 1 al 3");	
				}
				System.out.println("¿Cuantos dias has estado visitando clientes?");
				int diasVac=trabajo.nextInt();
				dineroVac=precioDia*diasVac;
				sueldoBaseSumado=sueldoBase+dineroVac;
				System.out.println("Introduzca su estado civil 1-Soltero 2-Casado");
				int estadoCivil=trabajo.nextInt();
				if (estadoCivil==1) {
				String EstCivil="Soltero";
				numIrpf=25;
				restadoIrpf=(sueldoBaseSumado*numIrpf)/100;
				sueldoBaseNeto=sueldoBaseSumado-restadoIrpf;
				}else if (estadoCivil==2) {
				String EstCivil="Casado";
				numIrpf=20;
				restadoIrpf=(sueldoBaseSumado*numIrpf)/100;
				sueldoBaseNeto=sueldoBaseSumado-restadoIrpf;
				}else {
				System.out.println("Solo se permite los numero 1 y 2");	
				}
				System.out.println("-----------------------------------");
				System.out.println("|  Sueldo Base "+sueldoBase+" |");
				System.out.println("|  Dietas ("+diasVac+" viajes)" +dineroVac+" |");
				System.out.println("|--------------------------|");
				System.out.println("Sueldo Bruto "+sueldoBaseSumado+" |");
				System.out.println("Retención IRPF (" +numIrpf+"%) "+restadoIrpf+" |" );
				System.out.println("|--------------------------|");
				System.out.println("| Salario Neto "+sueldoBaseNeto+" |");
				System.out.println("-----------------------------------");
				
	}

}
