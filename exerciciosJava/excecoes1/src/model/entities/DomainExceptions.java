package model.entities;
//classe para exceçao personalizada
public class DomainExceptions extends Exception {//subclasse da super classe exception

	private static final long serialVersionUID = 1L;
	
	public DomainExceptions(String msg) {//construtor que recebe uma string como argumento
		super(msg); //ele repassa a msg para o construtor da super classe
					//isso serve para podermos instanciar a classe DomainExceptions passando 
					//uma mensagem pra ela, ela ficara armazenada dentro da exceçao
	}
}
