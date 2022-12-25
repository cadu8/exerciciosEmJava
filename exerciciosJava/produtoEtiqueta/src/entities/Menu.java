package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa");
	
	List<Product> productList = new ArrayList<>();
	
	public void menu() throws ParseException {
		subMenu();
	}
	
	public void subMenu() throws ParseException {
		
		System.out.println("Produto data:");
		System.out.println("1 - Imported");
		System.out.println("2 - Used");
		System.out.println("3 - Common");
		System.out.println("4 - Tags");
		System.out.println("5 - Finish");
		sc.nextLine();
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
			subMenu();
		}else if(verificador.equals("2")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			System.out.print("Manufacture date DD/MM/YYYY: ");
			Date date = sdf.parse(sc.next());
			//adicionamos a subclasse UsedProduct na lista productlist (classe mae)
			productList.add(new UsedProduct(name, price, date));
			subMenu();
		}
		else if(verificador.equals("3")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			productList.add(new Product(name, price));
			subMenu();
		}
		else if(verificador.equals("4")) {
			for(Product c : productList) {
				System.out.println(c.priceTag());
			}
			subMenu();
		}
		else if(verificador.equals("5")) {
			System.out.println("FINISH");
		}
	}
}
