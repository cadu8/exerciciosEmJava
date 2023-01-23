package entities;

import java.util.Date;

public abstract class Pessoas {
	private String nome;
	private Date nascimento;
	
	
	public abstract void imprimirDados();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
}
