package geometria;

public class Test {

	public static void main(String[] args) {
		//crear un Triangulo y un Circulo con datos cualquiera
		//y despuÃ©s muestra el color y superficie de cada uno
		Triangulo tr=new Triangulo("verde", 2, 7);
		Circulo cr=new Circulo("azul",6);
		//mostramos datos
		/*System.out.println("Color: "+tr.getColor());
		System.out.println("Superficie: "+tr.superficie());
		System.out.println("Color: "+cr.getColor());
		System.out.println("Superficie: "+cr.superficie());*/
		mostrarDatos(tr);
		mostrarDatos(cr);
	}
	//este cÃ³digo sirve para cualquier subclase de Figura
	static void mostrarDatos(Figura f) {
		System.out.println("Color: "+f.getColor());
		System.out.println("Superficie: "+f.superficie());
	}

}

