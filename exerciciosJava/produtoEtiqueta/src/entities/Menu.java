package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	List<Product> productList = new ArrayList<>();
	
	public void menu() throws ParseException {
		subMenuPrincipal();
	}
	public void subMenuPrincipal() throws ParseException{
		System.out.println("--Welcome--");
		System.out.println("1 - Add tag");
		System.out.println("2 - Tag");
		System.out.println("3 - Finish");
		String verificador =  sc.nextLine();
		
		switch(verificador) {
		case "1":
			subMenu();
			subMenuPrincipal();
		case "2":
			mostrarLista();
			subMenuPrincipal();
			break;
		case "3":
			System.out.println("closed");
			break;
		}
	}
	public void subMenu() throws ParseException {
		System.out.println("Produto data:");
		System.out.println("1 - Imported");
		System.out.println("2 - Used");
		System.out.println("3 - Common");
		String verificador = sc.nextLine();
		
		if(verificador.equals("1")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			System.out.print("Customs fee: ");
			Double customsFee = sc.nextDouble();
			//adicionamos a subclasse ImoportedProduct na lista productlist (classe mae)
			
			productList.add(new ImoportedProduct(name, price, customsFee));
		}else if(verificador.equals("2")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			System.out.print("Manufacture date DD/MM/YYYY: ");
			Date date = sdf.parse(sc.next());
			//adicionamos a subclasse UsedProduct na lista productlist (classe mae)
			productList.add(new UsedProduct(name, price, date));
		}
		else if(verificador.equals("3")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			productList.add(new Product(name, price));
		}
	}
	public void mostrarLista() {
			for(Product c : productList) {
				System.out.println(c.priceTag());
			}
		}
	
}
