package priority;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Cliente;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente cl = new Cliente();
		cl.setNascimento(sdf.parse("05/10/2000"));
		cl.setNome("carlos");
		cl.imprimirDados();
	}

}
