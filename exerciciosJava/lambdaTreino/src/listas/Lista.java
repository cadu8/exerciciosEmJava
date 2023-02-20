package listas;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Lista é uma classe filha da classe mãe Dados
 * ela tem como objetivo coletar dados, armazenar em uma ArrayList e 
 * organizar essa lista em ordem alfebetica ou numerica utilizando lambda.
 * @author Carlos Eduardo
 *
 */
public class Lista extends Dados{
	List<Lista> list = new ArrayList<Lista>();
	
	public Lista() {
	}
	/**
	 * Construtos com o metodo super e os atributos da classe mãe
	 * @param name
	 * @param idade
	 * @param salario
	 */
	public Lista(String name, int idade, double salario) {
		super(name, idade, salario);
	}
	
	/**
	 * metodo adicionarLista que tem como parametro uma lista
	 * da classe Lista
	 * @param lista
	 */
	@Override
	public void adicionarLista(Lista lista) {
		this.list.add(lista);
	}
	
	/**
	 * metodo ordemAlfabetica tem como função por em ordem alfabetica 
	 * os nomes de cada objeto Lista criado, utilizando o metodo sort() com lambda
	 */
	public void ordemAlfabetica() {
		this.list.sort((a, b) -> a.getName().compareTo(b.getName()));
	}
	/**
	 * metodo ordemPorIdade tem como função por em ordem numerica 
	 * as idades de cada objeto Lista criado, utilizando o metodo sort() com lambda
	 */
	public void ordemPorIdade() {
		this.list.sort((a, b)-> Integer.compare(a.getIdade(), b.getIdade()));
	}
	/**
	 * metodo ordemPorSalario tem como função por em ordem numerica 
	 * os salarios de cada objeto Lista criado, utilizando o metodo sort() com lambda
	 */
	public void ordemPorSalario() {
		this.list.sort((a, b)-> Double.compare(a.getSalario(), b.getSalario()));
	}
	/**
	 * o metodo mostrarLista tem como funçao mostrar no console os objetos da ArrayLista 
	 * utilizando o metodo forEach() com lambda
	 */
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