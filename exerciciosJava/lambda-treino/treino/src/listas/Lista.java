package listas;

import java.util.ArrayList;
import java.util.List;

public class Lista extends Dados{
	List<Lista> list = new ArrayList<Lista>();
	
	public Lista() {
	}
	
	public Lista(String name, int idade, double salario) {
		super(name, idade, salario);
		this.list = list;
	}

	@Override
	public void adicionarLista(Lista lista) {
		this.list.add(lista);
	}
	
	public void ordemAlfabetica() {
		this.list.sort((a, b) -> a.getName().compareTo(b.getName()));
	}
	
	public void ordemPorIdade() {
		this.list.sort((a, b)-> Integer.compare(a.getIdade(), b.getIdade()));
	}
	public void ordemPorSalario() {
		this.list.sort((a, b)-> Double.compare(a.getSalario(), b.getSalario()));
	}
	
	public void mostrarLista() {
		this.list.forEach((list)->System.out.println(list.getName() + " IDADE: " + list.getIdade() + " SALARIO: " + String.format("%.2f",  list.getSalario())));
	}

	@Override
	public String toString() {
		return getName() 
			   + " "
			   + getIdade()
			   + " "
			   + String.format("R$ %n", getSalario());
	}
	
}
