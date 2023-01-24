package priority;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.CadastroPessoas;
import entities.Gerente;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Gerente cl = new Gerente();
		cl.setNascimento(sdf.parse("05/10/2000"));
		cl.setNome("carlos");
		cl.setSalario(1000);
		cl.setArea("Engenheiro");
		
		Gerente cl2 = new Gerente();
		cl2.setNascimento(sdf.parse("02/09/2001"));
		cl2.setNome("eduardo");
		cl2.setSalario(2000);
		cl2.setArea("Desenvolvedor");
		
		CadastroPessoas cadPessoas = new CadastroPessoas();
		
		cadPessoas.cadastrarPessoa(cl);
		cadPessoas.cadastrarPessoa(cl2);
		
		cadPessoas.imprimeCadastro();
	}

}
