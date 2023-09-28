package ejercicios;

import excepciones.CodBarraException;

public class CodigoBarras {

	public CodigoBarras(String codBarras) throws CodBarraException {
		// TODO Auto-generated constructor stub
		System.out.println("CODIGO DE BARRAS");
		String codBarrasPasado=codBarras.replace(" ","");//84 12345 67890 5 por 8412345678905
		compruebaLongitud(codBarrasPasado);
		double codNumBarra=compruebaValidez(codBarrasPasado);
		//double codSinDC=codNumBarra/10; //841234567890
		String codSinDC=codBarrasPasado.substring(0, 12);
		String digControlPuesto=codBarrasPasado.substring(12);
		System.out.println(digControlPuesto);
		int digCalc=calculaSuma(codSinDC);
		String digCalcText=String.valueOf(digCalc);
		compruebaDigito(digCalcText,digControlPuesto);
		System.out.println("Enhorabuena has introducido tu codigo de barra correctamente");
	}

	private void compruebaDigito(String digCalcText, String digControlPuesto) throws CodBarraException {
		// TODO Auto-generated method stub
		try {
			if(digCalcText.equals(digControlPuesto)) {
				
			}
			else {
				throw new CodBarraException();
			}
		}catch (CodBarraException e) {
			// TODO: handle exception
			throw new CodBarraException();
		}
	}

	private int calculaSuma(String codSinDC) {
		// TODO Auto-generated method stub
		int [] numPosi=new int[12];
		int pos=1;
		String pasandose="";
		int cambio=0;
		char numero;
		int acumulaPares=0;
		int acumulaImpares=0;
		for(int x=0;x<codSinDC.length();x++) {
			numero=codSinDC.charAt(x);
			pasandose+=numero;
			cambio=Integer.parseInt(pasandose);
			if(pos%2==0) {
				acumulaPares+=cambio;
			}
			else {
				acumulaImpares+=cambio;
			}
			pasandose="";
			pos++;
		}
		acumulaPares=acumulaPares*3;
		acumulaImpares=acumulaImpares*1;
		int suma=acumulaPares+acumulaImpares; //105
		int ult_num=suma%10; //5
		if(ult_num==0) {
			return ult_num;
		}
		int digControl=10-ult_num;
		
		return digControl;
	}

	private double compruebaValidez(String codBarrasPasado) throws CodBarraException {
		// TODO Auto-generated method stub
		double codBarra_SinEspacios=0;
		try {
			codBarra_SinEspacios=Double.parseDouble(codBarrasPasado);
		}catch (Exception e) {
			// TODO: handle exception
			throw new CodBarraException();
		}
		return codBarra_SinEspacios;
	}

	private void compruebaLongitud(String codBarrasPasado) throws CodBarraException {
		// TODO Auto-generated method stub
		try {
			if(codBarrasPasado.length()!=13) {
				throw new CodBarraException();
			}
		}catch (CodBarraException e) {
			// TODO: handle exception
			throw new CodBarraException();
		}
		
		
	}

}
