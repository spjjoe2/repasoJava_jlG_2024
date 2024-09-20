package view;

import java.util.Scanner;

import service.Calculadora;

public class Principal {
	//punto de entrada al programa Java
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					sumar();
					break;
				case 2:
					restar();
					break;
				case 3:
					multiplicar();
					break;
				case 4:
					dividir();
					break;
				case 5:
					factorial();
					break;
				case 6:
					System.out.println("adios!");
			}
		}while(opcion!=6);
	}
	//mÃ©todos
	static void menu() {
		System.out.println("1.-Sumar");
		System.out.println("2.-Restar");
		System.out.println("3.-Multiplicar");
		System.out.println("4.-Dividir");
		System.out.println("5.-Factorial");
		System.out.println("6.-Salir");
	}
	static Calculadora getCalculadora() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nÃºmero: ");
		int a=sc.nextInt();
		System.out.println("Introduce otro nÃºmero: ");
		int b=sc.nextInt();
		Calculadora cal=new Calculadora(a, b);
		return cal;
	}
	
	static void sumar() {
		Calculadora cal=getCalculadora();
		System.out.println("La suma es: "+cal.sumar());
	}
	static void restar() {
		Calculadora cal=getCalculadora();
		System.out.println("La resta es: "+cal.restar());
	}
	static void multiplicar() {
		Calculadora cal=getCalculadora();
		System.out.println("La multiplicaciÃ³n es: "+cal.multiplicar());
	}
	static void dividir() {
		Calculadora cal=getCalculadora();
		System.out.println("La divisiÃ³n es: "+cal.dividir());
	}
	
	static void factorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nÃºmero: ");
		int a=sc.nextInt();
		System.out.println("El factorial es "+Calculadora.factorial(a));
	}
}

