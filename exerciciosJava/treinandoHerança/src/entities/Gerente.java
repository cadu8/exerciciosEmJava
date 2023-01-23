package entities;

import java.text.SimpleDateFormat;

public class Gerente extends Funcionario {

	@Override
	public void imprimirDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nome: " + getNome());
		System.out.println("Nascimento: " + sdf.format(getNascimento()));
		System.out.println("Salario: " + getSalario());
	}

	@Override
	public float getSalario() {
		return salario;
	}

	@Override
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public double calculaImposto(double imposto) {
		return getSalario() * 0.03;
	}

}
