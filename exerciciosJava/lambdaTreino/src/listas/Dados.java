package listas;
/**
 * A classe Dados � uma classe na qual contem os atributos e metodos abstratos
 * que tem como objetivo servir de classe m�o para a classe Lista
 * @author Carlos Eduardo
 */
public abstract class Dados {

	private String name;
	private int idade;
	private double salario;
	
	public Dados() {
	}
	
	/**
	 * Construtor com tr�s parametros
	 * @param name � uma String que pega o nome do usuario
	 * @param idade � um int que pega a idade do usuario
	 * @param salario � um double que pega o salario do usuario
	 */
	public Dados(String name, int idade, double salario) {
		this.name = name;
		this.idade = idade;
		this.salario = salario;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * O metodo adicionarLista adiciona atributos da classe Lista
	 * em uma Arraylist
	 * @param lista
	 */
	public abstract void adicionarLista(Lista lista);
	
}