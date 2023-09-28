package darleALasTeclas;

import java.util.Scanner;

public class TeclasConFunciones {

	public TeclasConFunciones() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);		
		System.out.println("Introduce un numero, si la suma de sus cifras es primo, entonces mostrala por pantalla");
		int num=0;
		int guardaNum=0;
		int contPrimos=0;
		while(num>=0) {
			num=leer.nextInt();
			if(num<0)
				break;
			guardaNum=num;
			int cifrasSuma=sumacifra(num);
			boolean esPrimo=calculaprimo(cifrasSuma);
			if(esPrimo) {
				contPrimos++;
				System.out.println(guardaNum);
				System.out.println(cifrasSuma);
			}
		}
		System.out.println("Hay "+contPrimos+" primos de las sumas de las cifras");
	}

	private boolean calculaprimo(int cifrasSuma) {
		// TODO Auto-generated method stub
		int contDiv=2;
		while(contDiv<cifrasSuma) {
			if (cifrasSuma%contDiv==0) {
				return false;
			}
			
			contDiv++;
		}
		return true;
	}

	private int sumacifra(int num) {
		// TODO Auto-generated method stub
		int sumarcifras=0;
		while(num>0) {
			sumarcifras+=num%10;
			num/=10;
		}
		
		
		return sumarcifras;
	}

}
