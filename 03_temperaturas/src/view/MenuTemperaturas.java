package view;

import java.util.Scanner;

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
		System.out.println("1.-Guardar Temperatura");
		System.out.println("2.-Temperatura MÃ¡xima");
		System.out.println("3.-Temperatura MÃ­nima");
		System.out.println("4.-Temperatura Media");
		System.out.println("5.-Salir");


	}
	static void guardar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una temperatura");
		double temperatura = sc.nextDouble();
		service.guardar(temperatura);

	}
	static void getMaxima() {
		System.out.println("La temperatura mÃ¡xima es " + service.getMaxima());
	}
	static void getMinima() {
		System.out.println("La temperatura mÃ­nima es " + service.getMinima());
	}

	static void getMedia() {

		System.out.println("La temperatura media es " + service.getMedia());

	}

}


