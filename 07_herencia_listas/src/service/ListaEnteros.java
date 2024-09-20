package service;

import java.util.ArrayList;

public class ListaEnteros extends ArrayList<Integer>{
	public int sum() {
		int suma=0;
		/*for(int n:this) {
			suma+=n;
		}*/
		for(int i=0;i<size();i++) {
			suma+=get(i);
		}
		return suma;
	}
	public double average() {
		return size()>0?sum()/size():0;
	}
	@Override
	public boolean add(Integer e) {
		//si no lo contiene, lo aÃ±ade
		if(!contains(e)) {
			return super.add(e);
		}else {
			return false;
		}
	}
	@Override
	public void add(int index, Integer element) {
		if(!contains(element)) {
			super.add(index, element);
		}
	}
	
	
	
}

