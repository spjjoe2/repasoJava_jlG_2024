package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Curso;

public class CursosService {
	ArrayList<Curso> cursos;
	
	public CursosService() {
		cursos=new ArrayList<>();
	}
	
	public void guardarCurso(Curso curso) {
		cursos.add(curso);
	}
	public List<Curso> filtrarPorPrecioMax(double precio){
		/*List<Curso> aux=new ArrayList<Curso>();
		for(Curso c:cursos) {
			if(c.getPrecio()<=precio) {
				aux.add(c);
			}
		}
		return aux;*/
		
		return cursos.stream()
		.filter(c->c.getPrecio()<=precio)
		.toList();//List
	}
	
	public void eliminarPorNombre(String nombre) {
		/*Iterator<Curso> it=cursos.iterator();
		while(it.hasNext()) {
			Curso c=it.next();
			if(c.getNombre().equals(nombre)) {
				it.remove();
			}
		}*/
		
		cursos.removeIf(c->c.getNombre().equals(nombre));
	}
	public boolean modificarDuracion(String nombre, int nuevaDuracion) {
		
		/*boolean res=false;
		  for(Curso c:cursos) {
			if(c.getNombre().equals(nombre)) {
				c.setDuracion(nuevaDuracion);
				res=true;
				break;
			}
		}
		return res;
		*/
		
		return cursos.stream()
		.filter(c->c.getNombre().equals(nombre))
		.peek(c->c.setDuracion(nuevaDuracion))
		.count()>0;
	}
}

