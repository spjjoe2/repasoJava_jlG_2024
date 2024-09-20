package polimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OperacionesPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums1=new ArrayList<>();
		nums1.add(20);nums1.add(4);nums1.add(12);
		System.out.println(sumaEnteros(nums1));
		List<Integer> nums2=List.of(8,4,11,5);
		System.out.println(sumaEnteros(nums2));
	}
	
	
	//realizar mÃ©todo que devuelva la suma de todos los nÃºmeros
	//de la lista de enteros recibida como parÃ¡metro
	
	static int sumaEnteros(List<Integer> lista) {
		int suma=0;
		for(Integer n:lista) {
			suma+=n;
		}
		return suma;
	}
	
	//realizar un mÃ©todo que reciba una colecciÃ³n de Integer y 
	//devuelva una lista con todos los nÃºmeros positivos de la colecciÃ³n
	static List<Integer> positivos(Collection<Integer> coleccion){
		/*List<Integer> auxiliar=new ArrayList<Integer>();
		for(Integer n:coleccion) {
			if(n>0) {
				auxiliar.add(n);
			}
		}
		return auxiliar;*/
		return coleccion.stream()
				.filter(n->n>0)
				.toList();
	}
	

}

