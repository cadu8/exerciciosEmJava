package entities;
//classe responsavel para ser instanciada na classe principal
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	List<TaxPayer> taxPayerList = new ArrayList<>();
	
	public void menu() {
	System.out.println("======START======");	
	System.out.println("want to add a new contributor? ");
	System.out.println("1 - YES ");
	System.out.println("2 - NOT ");
	System.out.println("3 - SHOW ON SCREEN ");
	String checker = sc.next(); 
	
	switch(checker) {
	case "1":
		subMenu();
		menu();
		break;
	case "2":
		System.out.println("CLOSED");
		break;
		
	case "3":
		screen();
		menu();
		break;
		}
	}
	
	public void subMenu() {
		System.out.println("Tax payer data:");
		System.out.println("Individual or company (i/c)? ");
		char checker = sc.next().charAt(0);
		if(checker == 'i') {
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double anualIncome = sc.nextDouble();
			System.out.println("Health expenditures: ");
			double healthExpenditures = sc.nextDouble();
			taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
			
		}else if(checker == 'c') {
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double anualIncome = sc.nextDouble();
			System.out.println("Number of emplyees: ");
			int numberOfEmployees = sc.nextInt();
			taxPayerList.add(new Company(name, anualIncome, numberOfEmployees));
		}
	}
	public void screen() {
		double summation = 0;

		for(TaxPayer c : taxPayerList) {
			System.out.println(c);
			summation += c.tax();
		}
		System.out.printf("Total taxes: $ %.2f%n", summation);
	}
}
