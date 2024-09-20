package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PropagarExcepcion {

	public static void main(String[] args) throws OperacionNoValidaException {
		//try {
			System.out.println("La suma es: "+calcularSuma());
		/*}
		catch(OperacionNoValidaException ex) {
			System.out.println("Fichero no encontrado");
		}*/
	}

	//mÃ©todo que devuelve la suma de los nÃºmeros
	//guardados en el fichero numeros.txt
	static int calcularSuma() throws OperacionNoValidaException {
		try {
			return Files.lines(Path.of("numeros2.txt")) //Stream<String>
			.mapToInt(x->Integer.parseInt(x))
			.sum();
		}
		catch(IOException ex) {
			//transformar la excpciÃ³n original IOException
			//en una nueva personalizada
			throw new OperacionNoValidaException();
		}
	}
}
