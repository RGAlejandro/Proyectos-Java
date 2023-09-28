package examenRecuperacion1Trimestre;

public class NumeroCurioso {

	public NumeroCurioso() {
		// TODO Auto-generated constructor stub
		System.out.println("CALCULAR SI UN NUMERO ES CURIOSO");
		for(int x=0;x<50000;x++) {
			String numCadena=String.valueOf(x);
			double fac=factorial(numCadena);
			int numFac=(int)fac;
			String numFacCalc=Integer.toString(numFac);
			boolean esCurioso=true;
			esCurioso=numFacCalc.equals(numCadena);
			if(esCurioso) {
				System.out.println("El numero "+numCadena+ " es un numero CURIOSO");
			}
		}
		
	}

	private double factorial(String numCadena) {
		// TODO Auto-generated method stub
		double fac=0;
		char numero;
		int num=0;
		int multiplicador=0;
		int sumaFac=0;
		for(int x=0;x<numCadena.length();x++) {
			numero=numCadena.charAt(x);
			num=Integer.parseInt(String.valueOf(numero));
			sumaFac=0;
			if(num==0 || num==1) {
				sumaFac=1;
			}
			else {
				multiplicador=num-1;
				
				for(int i=num;i>1;i--) {
					sumaFac=num*multiplicador;
					num=sumaFac;
					multiplicador--;
				}
			}
			
			fac+=(int)sumaFac;
		}
		
		return fac;
	}

}
