package listas;

public abstract class Dados {
	private String name;
	private int idade;
	private double salario;
	
	public Dados() {
	}
		
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
	
	public abstract void adicionarLista(Lista lista);
	
}
