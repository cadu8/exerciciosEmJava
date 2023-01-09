package model.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.exceptions.DomainExceptions;

public class FuncoesMenu {
	Scanner sc = new Scanner(System.in);
	
	public void criarPasta() throws DomainExceptions {
		//escolha de criar ou nao uma nova pasta
		System.out.println("---CRIAR PASTA---");
		System.out.println("1 - criar");
		System.out.println("2 - sair");
		char verificador = sc.next().charAt(0);
		//tratamento da exceçao 
		if(verificador != '1' && verificador != '2') {
			throw new DomainExceptions("Invalido, somente numero 1 ou 2 \n");
		}
		//verificando se ira ou nao criar uma nova pasta
		switch(verificador) {
		case '1':
			
			//pegando o caminha de onde a pasta irá ser criada
			System.out.print("Digite o caminho da criação da pasta: ");
			sc.nextLine();
			String pasta = sc.nextLine();
			File file = new File(pasta);
			
			//se o caminho indicado nao existir, irá entrar nesse loop
			while(file.getParentFile() == null ) {
				System.out.println("Caminho nao localizado");
				System.out.println("Digite o caminho da criação da pasta: ");
				pasta = sc.nextLine();
				file = new File(pasta);
			}
			//nomeando a pasta
			System.out.print("Digite o nome da pasta a ser criada: ");
			String nomePasta = sc.nextLine();
			
			//criando a pasta
			boolean sucesso = new File(pasta + "\\" + nomePasta).mkdir();
			
			//se a pasta nao for criada, irá entrar nesse loop
			while(!sucesso) {
				System.out.println();
				System.out.println("PASTA NAO CRIADA, FAÇA NOVAMENTE");
				System.out.print("Digite o caminho da criação da pasta: ");
				pasta = sc.nextLine();
				file = new File(pasta);
				System.out.print("Digite o nome da pasta a ser criada: ");
				nomePasta = sc.nextLine();
				sucesso = new File(pasta + "\\" + nomePasta).mkdir();
			}
			//caso seja criada, irá ser finalizada o processo e irá reiniciar uma nova criaçao de pasta
			if(sucesso) {
				System.out.println("Pasta criada \n");
			}
			criarPasta();
			sc.close();
			break;
		case '2':
			System.out.println("SAINDO");
			break;
		}
	}
	
	public void criarArquivo() throws DomainExceptions {
		System.out.println("1 - CRIAR ARQUIVO ");
		System.out.println("2 - ACRESCENTAR ARQUIVO ");
		char verificador = sc.next().charAt(0);
		
		if(verificador != '1' && verificador != '2') {
			throw new DomainExceptions("Invalido, somente numero 1 ou 2 \n");
		}
		
		switch(verificador) {
		case '1':
			System.out.println("CRIANDO UM ARQUIVO");
			System.out.println("Digite o local para o novo arquivo: ");
			sc.next();
			String localArquivo = sc.nextLine();
			System.out.println("Digite o nome do arquivo a ser criado: ");
			String nomeArquivo = sc.next();
			String nomeArquivo2 = localArquivo + "\\" + nomeArquivo;
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo2, true))){
				System.out.println("Deseja adicionar alguma escrita no arquivo ?");
				System.out.println("1 - sim");
				System.out.println("2 - não");
				
				char verificadorEscrita = sc.next().charAt(0);
				
				if(verificadorEscrita != '1' && verificadorEscrita != '2') {
					throw new DomainExceptions("Invalido, somente numero 1 ou 2 \n");
				}
				if(verificadorEscrita == '1') {
					int contador = 0;
					while(contador != 2) {
						System.out.println("Digite a linha: ");
						String linha = sc.nextLine();
						bw.write(linha);
						bw.newLine();
						System.out.println("Adicionar outra linha ? ");
						System.out.println("1 - sim ");
						System.out.println("2 - não ");
					}
				}
			}
			catch(IOException e) {
			System.out.println(e.getMessage()); 
			}
		}


		sc.close();
	}
}
