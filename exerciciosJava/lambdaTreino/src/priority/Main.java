package priority;
/**
 * Classe principal do codigo
 */
import listas.Dados;
import listas.Lista;

public class Main {

	public static void main(String[] args){
		
		Lista armazenagem = new Lista();
		Lista d1 = new Lista("Cadu", 22, 720.00);
		Lista d2 = new Lista("Quezia", 21, 200.00);
		Lista d3 = new Lista("Lucas", 11, 5000.00);
		
		armazenagem.adicionarLista(d1);
		armazenagem.adicionarLista(d2);
		armazenagem.adicionarLista(d3);
		
		//lista em ordem alfabetica
		armazenagem.ordemAlfabetica();		
		armazenagem.mostrarLista();
		
		System.out.println();
		
		//lista em ordem numerica IDADE
		armazenagem.ordemPorIdade();
		armazenagem.mostrarLista();
		System.out.println();
		
		//lista em ordem numerica SALARIO
		armazenagem.ordemPorSalario();
		armazenagem.mostrarLista();
	}

}