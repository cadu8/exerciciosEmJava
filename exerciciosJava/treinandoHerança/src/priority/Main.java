package priority;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.CadastroPessoas;
import entities.MinhaExcecao;
import entities.Gerente;

public class Main {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Gerente cl = new Gerente();
			
	
		cl.setNascimento(sdf.parse("12"));
		cl.setNome("");			
		cl.setSalario(1000);
		cl.setArea("");
		CadastroPessoas cadPessoas = new CadastroPessoas();
		cadPessoas.imprimeCadastro();	


	
		
//		Gerente cl2 = new Gerente();
//		cl2.setNascimento(sdf.parse("02/09/2001"));
//		cl2.setNome("eduardo");
//		cl2.setSalario(2000);
//		cl2.setArea("Desenvolvedor");
		
		
		//cadPessoas.cadastrarPessoa(cl);
		//cadPessoas.cadastrarPessoa(cl2);
		
	}

}
