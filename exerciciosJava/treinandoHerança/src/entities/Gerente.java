package entities;

import java.text.SimpleDateFormat;

public class Gerente extends Funcionario {
	private String area;
	
	@Override
	public void imprimirDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nome: " + getNome());
		System.out.println("Nascimento: " + sdf.format(getNascimento()));
		System.out.println("Area: " + getArea());
		System.out.println("Salario: " + getSalario());
		System.out.println("Imposto: " + calculaImposto());
	}

	@Override
	public float getSalario() {
		return salario;
	}

	@Override
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public float calculaImposto() {
		float resultado = (float) (this.salario* 0.05);
		return resultado;
	}

}
