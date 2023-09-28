package AprenderAAprender;

public class AprenderCuentaBancaria {

	public AprenderCuentaBancaria() {
		// TODO Auto-generated constructor stub
		System.out.println("COMPRUEBA CUENTA BANCARIA");
		String cuentaBancaria="12340019001234567887";
		boolean CuentaBancariaValida=true;
		CuentaBancariaValida=dividePorPartes(cuentaBancaria);
		if(CuentaBancariaValida) {
			System.out.println("Esta cuenta bancaria es correcta");
		}
		else {
			System.err.println("Lo siento pero esta cuenta bancaria no es correcta");
		}
	}

	private boolean dividePorPartes(String cuentaBancaria) {
		// TODO Auto-generated method stub
		boolean esValido=true;
		if(cuentaBancaria.length()!=20) {
			esValido=false;
		}
		String DigControlEscrito=cuentaBancaria.substring(8,10);
		
		String entidad=cuentaBancaria.substring(0,4);
		int entidadNums=Integer.parseInt(entidad);
		//System.out.println(Entidad); 3453
		String sucursal=cuentaBancaria.substring(4,8);
		int sucursalNums=Integer.parseInt(sucursal);
		//System.out.println(Sucursal); 4327
		String digControlIzq=cuentaBancaria.substring(0,8);
		String cerosAdicionales="00";
		int cerosNums=Integer.parseInt(cerosAdicionales);
		String numCalcIzq=cerosAdicionales+digControlIzq;//0034534327
		String parteNumBanco=cuentaBancaria.substring(10,20);
		String numCalcDer=parteNumBanco; //8735425853
		
		//int numCalcInt=Integer.parseInt(numCalc);
		//No puede ser ya que elimina los 2 ceros de delante
		//System.out.println(numCalcInt);
		char numeroChar;
		int acumulaSumaDigIzq=0;
		int acumulaSumaDigDer=0;
		int pos=0;
		for(int x=0;x<numCalcIzq.length();x++) {
			numeroChar=numCalcIzq.charAt(x);
			acumulaSumaDigIzq+=calculaDigControlIzq(numeroChar,pos);
			pos++;
		}
		
		int DigControlIzq=11-(acumulaSumaDigIzq%11);
		String DigControlIzqCad=Integer.toString(DigControlIzq);
		pos=0;
		for(int x=0;x<numCalcDer.length();x++) {
			numeroChar=numCalcDer.charAt(x);
			acumulaSumaDigDer+=calculaDigControlDer(numeroChar,pos);
			pos++;
		}
		int DigControlDer=11-(acumulaSumaDigDer%11);
		String DigControlDerCad=Integer.toString(DigControlDer);
		String DigControlFusion=DigControlIzqCad+DigControlDerCad;
		
		if(DigControlFusion.equals(DigControlFusion)) {

		}
		else {
			esValido=false;
		}
		
		
		return esValido;
	}

	private int calculaDigControlDer(char numeroChar, int pos) {
		// TODO Auto-generated method stub
		int [] multiplicadores={1,2,4,8,5,10,9,7,3,6};
		int suma;
		int num=Integer.parseInt(String.valueOf(numeroChar));
		int multi=num*multiplicadores[pos];
		suma=multi;
		
		return suma;
	}

	private int calculaDigControlIzq(char numeroChar, int pos) {
		// TODO Auto-generated method stub
		int [] multiplicadores={1,2,4,8,5,10,9,7,3,6};
		int suma;
		int num=Integer.parseInt(String.valueOf(numeroChar));
		int multi=num*multiplicadores[pos];
		suma=multi;
		
		return suma;
	}

}
