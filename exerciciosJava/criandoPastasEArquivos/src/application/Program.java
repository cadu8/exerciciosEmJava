package application;

import model.entities.FuncoesMenu;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) throws DomainExceptions {
		FuncoesMenu menu = new FuncoesMenu();
		menu.criarArquivo();
	}

}
