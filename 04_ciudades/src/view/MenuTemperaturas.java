package view;

import java.util.Scanner;

import model.Ciudad;
import service.TemperaturasService;

public class MenuTemperaturas {
	static TemperaturasService service=new TemperaturasService();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion;
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				guardar();
				break;
			case 2:
				getMaxima();
				break;
			case 3:
				getMinima();
				break;
			case 4:
				getMedia();
				break;
			case 5:
				System.out.println("Hasta luego Maritrini!");
			}
		}while(opcion!=5);
	}

	//mÃ©todos
	static void menu() {
		System.out.println("1.-Guardar Ciudad");
		System.out.println("2.-Ciudad con temperatura MÃ¡xima");
		System.out.println("3.-Ciudad con temperatura MÃ­nima");
		System.out.println("4.-Temperatura Media");
		System.out.println("5.-Salir");


	}
	static void guardar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce nombre ciudad");
		String nombre=sc.nextLine();
		System.out.println("Introduce temperatura ciudad");
		double temperatura = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce nÃºmero habitantes");
		int habitantes = Integer.parseInt(sc.nextLine());
		service.guardar(nombre,temperatura,habitantes);

	}
	static void getMaxima() {
		Ciudad ciudad=service.getMaxima();
		System.out.println("La ciudad con temperatura mÃ¡s alta es " + ciudad.getNombre());
	}
	static void getMinima() {
		Ciudad ciudad=service.getMinima();
		System.out.println("La ciudad con temperatura mÃ¡s baja es " + ciudad.getNombre());
	}

	static void getMedia() {
		System.out.println("La temperatura media es " + service.getMedia());
	}

}

