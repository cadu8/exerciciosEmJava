package entitie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitie.enums.Aprovacao;

public class AlunoCadastro {
	Scanner sc = new Scanner(System.in);
	
	public String name;
	public String matricula;
	public double prova1;
	public double prova2;
	public double trabalho;
	//puxando a classe enums
	public Aprovacao aprovacao;
	//criando uma lista para cadastrar todos os alunos
	public List<AlunoCadastro> alunoCadastro = new ArrayList<>();
	//construtor
	public AlunoCadastro() {
	}
	
	public AlunoCadastro(String name, String matricula, double prova1, double prova2, double trabalho ) {
		this.name = name;
		this.matricula = matricula;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho = trabalho;
	}
	//metodo menu, ele ira imprimir todos os metodos da classe
	public void menu() {
		System.out.print("=======BEM-VINDOS======= \n");
		System.out.print("Deseja adicionar um novo aluno ? \n 1 = sim \n 2 = não \n 3 = mostrar alunos \n 4 = Media alunos \n \n");
		String verificador = sc.next();
		
		switch(verificador) {
		case "1":
			subMenu();
			menu();
			break;
		case "2":
			System.out.println("FINALIZADO");
			break;
		case "3":
			listasAlunos();
			menu();
			break;
		case "4":
			media();
			menu();
			break;
		}
	}
	//sub menu 
	public void subMenu() {
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Matrícula: ");
		String matricula = sc.nextLine();
		int verificadorMatricula = matricula.length();
		if(verificadorMatricula != 4 ) {
			while(verificadorMatricula != 4 ) {
				
				System.out.println("Matricula invalida");
				System.out.println("Digite novamente: ");
				matricula = sc.nextLine();
				verificadorMatricula = matricula.length();
			}
		}

		System.out.print("Prova1: ");
		double prova1 = sc.nextDouble();
		System.out.print("Prova2: ");
		double prova2 = sc.nextDouble();
		System.out.print("Trabalho: ");
		double trabalho = sc.nextDouble();

		AlunoCadastro alunoCadastrado = new AlunoCadastro(nome, matricula, prova1, prova2, trabalho);
		alunoCadastro.add(alunoCadastrado);
	}
	//metodo para imprimir os objetos
	@Override
	public String toString() {
		return    "Name: "
				+ name
				+ "\nMatrícula: "
				+ matricula
				+ "\nNotas: "
				+ String.format("%.2f %.2f %.2f", prova1, prova2, trabalho)
				+ String.format("\n");
	}
	//metodo para percorrer toda a lista de alunos
	public void listasAlunos() {
		for(AlunoCadastro alunos : alunoCadastro) {
			System.out.println(alunos.toString());
		}	
	}
	//metodo para imprimir a media e verificar a situaçao do aluno
	public void media() {
		for(AlunoCadastro alunos : alunoCadastro) {
			double media = (alunos.prova1 + alunos.prova2 + alunos.trabalho)/3;
			
			if(media > 6) {
				System.out.println("Nome: " + alunos.name);
				System.out.printf("Média: %.2f%n" , media);
				System.out.printf("Pontos para passar: " , (media - 6));
				System.out.println(aprovacao.REPROVADO + "\n");
			}
			else {
				System.out.println("Nome: " + alunos.name);
				System.out.printf("Média: %.2f%n" , media);
				System.out.println(aprovacao.APROVADO + "\n");
			}
		}
	}
}
