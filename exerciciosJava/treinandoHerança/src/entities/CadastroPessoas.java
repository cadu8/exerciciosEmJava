package entities;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
	private int qtdAtual;
	
	private List<Pessoas> pessoasLista = new ArrayList<Pessoas>();
	
	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	
	public List<Pessoas> getPessoasLista() {
		return pessoasLista;
	}
	
	public void cadastrarPessoa(Pessoas pess) {
		pessoasLista.add(pess);
	}
	
	public void imprimeCadastro(){
		for(Pessoas p : pessoasLista) {
			p.imprimirDados();
			System.out.println();
			
		}
	}
}
