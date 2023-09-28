package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros2 {

	public Ficheros2() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero;
		fichero=new File("alumnos.txt");
		if(!fichero.exists())
			fichero.createNewFile();
		
		//Leer Fichero
		
		FileReader fr;
		BufferedReader br;
		String nombre = "";
		fr=new FileReader(fichero);
		br=new BufferedReader(fr);
		
		/*nombre=br.readLine();
		System.out.println(nombre);
		nombre=br.readLine();
		System.out.println(nombre);
		nombre=br.readLine();
		System.out.println(nombre);
		nombre=br.readLine();
		System.out.println(nombre);*/
		//La unica ventaja de lo de arriba es que si haces algun tipo de operacion y quieres volver a leer la siguiente linea empiezas
		//por donde lo dejaste
		
		while((nombre=br.readLine())!=null) {
			System.out.println(nombre);
		}
		
		//Alumno2
		
		fichero =new File("alumnos2.txt");
		fr=new FileReader(fichero);
		br=new BufferedReader(fr);
		int edad;
		String curso;
		while((nombre=br.readLine())!=null) {
			edad=Integer.parseInt(br.readLine());
			curso=br.readLine();
			System.out.println(nombre+"-"+curso+"-"+edad);
		}
		
		//Alumno3
		fichero=new File("alumnos3.txt");
		fr=new FileReader(fichero);
		br=new BufferedReader(fr);
		String linea="";
		while((linea=br.readLine())!=null) {
			String[]datos=linea.split(",");
			nombre=datos[0];
			curso=datos[2];
			edad=Integer.parseInt(datos[1]);
			System.err.println(nombre+"-"+curso+"-"+edad);
		}
		
	}

}
