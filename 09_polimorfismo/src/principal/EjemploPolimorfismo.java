package principal;

public class EjemploPolimorfismo {

	public static void main(String[] args) {
		System.out.println(cuadrado(8));
		System.out.println(cuadrado(3.2));
		System.out.println(getAleatorio());
	}
	
	//hacer un mÃ©todo que devuelva el cuadrado del nÃºmero recibido como parÃ¡metro
	//el nÃºmero podrÃ¡ ser de cualquier tipo. El resultado si se entregarÃ¡ como int
	static int cuadrado(Number num) {
		return num.intValue()*num.intValue();
	}
	
	
	//hacer un mÃ©todo que devuelva, aleatoriamente, un Double, un Integer o un Long, en 1 y 500
	static Number getAleatorio() {
		double r=Math.random()*500+1;
		int n=(int)(Math.random()*3+1);
		return switch(n) {
			case 1->Double.valueOf(r);
			case 2->(int)r;
			default ->(long)r;
		};
	}
	
	

}


