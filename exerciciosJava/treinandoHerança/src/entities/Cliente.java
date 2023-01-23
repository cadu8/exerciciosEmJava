package entities;

import java.text.SimpleDateFormat;

public class Cliente extends Pessoas {

	private int codigo;
	
	
	@Override
	public void imprimirDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nome: " + getNome());
		System.out.println("Nascimento: " + sdf.format(getNascimento()));
		System.out.println("Codigo: " + getCodigo());
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
