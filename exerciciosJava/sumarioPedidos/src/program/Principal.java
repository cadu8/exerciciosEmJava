package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Enter client data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.next();
			System.out.print("Birth date (dd/MM/yyyy): ");
			Date birthDate = sdf.parse(sc.next());
			System.out.println("Enter order data:");
			System.out.print("STATUS: ");
			
			Client client = new Client(name, email, birthDate);
			
			//convertendo string para o valor correspondente no OrderStatus
			OrderStatus status = OrderStatus.valueOf(sc.next());
			
			Order order = new Order(new Date(), status, client);
			
			System.out.println("Quantos itens deseja adicionar ?");
			int verificador = sc.nextInt();
			for(int i = 0; i < verificador; i++) {
				System.out.println();
				System.out.print("Product name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Product price:");
				double priceProduct = sc.nextDouble();
				System.out.print("Quantity: ");
				int quantity = sc.nextInt();
				
				Product product = new Product(productName, priceProduct);
				
				OrderItem it = new OrderItem(quantity, priceProduct, product);
				
				order.addItem(it);
			}
	
			System.out.println(order);
			sc.close();
	}

}
