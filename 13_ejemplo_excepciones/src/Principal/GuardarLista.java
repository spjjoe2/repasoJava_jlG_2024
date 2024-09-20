package principal;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class GuardarLista {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(4,11,8,2);
		int a=6;
		int b=0;
		//guardar cada nÃºmero en una lÃ­nea de un fichero
		try {
			PrintStream out=new PrintStream("numeros.txt");
			for(Integer n:numeros) {
				out.println(n);
			}
			System.out.println(a/b);
		}
		catch(IOException ex) {
			System.out.println("error de fichero");
		}
		catch(ArithmeticException ex) {
			System.out.println("No se puede dividir por 0");
		}
		
	}

}


