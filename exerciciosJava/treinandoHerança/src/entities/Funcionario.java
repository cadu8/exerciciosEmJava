package entities;

import java.text.SimpleDateFormat;

public abstract class Funcionario extends Pessoas{
	protected float salario;
	
	@Override
	public abstract void imprimirDados();
	
	public abstract float getSalario();
	public abstract void setSalario(float salario);
}
