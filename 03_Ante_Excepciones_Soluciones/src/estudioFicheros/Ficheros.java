package estudioFicheros;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ficheros {

	public Ficheros() {
		// TODO Auto-generated constructor stub
		System.out.println("Estudio de ficheros");
		File fichero,directorio;
		
		directorio=new File("Ficheros");
		boolean exito=directorio.mkdir();
		if(exito)System.out.println("Directorio creado con exito");
		else System.err.println("No se ha creado el directorio o ya existe");
		//podemos saber szi es directorio
		if(directorio.isDirectory())
			System.out.println("Es un directorio");
		
		
		fichero=new File("alumnos.txt");
		try {
			exito = fichero.createNewFile();
			if(exito) System.out.println("Enhorabuena has creado el fichero");
			else System.err.println("Lo siento pero ese fichero o no lo has hecho bien o ya existe");
			
			System.out.println("El nombre del fichero es :"+fichero.getName());
			System.out.println("El nombre del fichero es :"+fichero.getPath());
			System.out.println("El nombre del fichero es :"+fichero.getParent());
			System.out.println("El nombre del fichero es :"+fichero.getAbsolutePath());
			System.out.println("El nombre del fichero es :"+fichero.lastModified());
			//System.out.println("El nombre del fichero es :"+fichero.lastModified());
			String []ficheros=directorio.list();
			System.out.println("Listado :"+Arrays.toString(ficheros));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
