package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Employee employee;
	Scanner sc = new Scanner(System.in);
	List<Employee> employeeList = new ArrayList<>();

	public void menu() {
		System.out.println("=====Bem-Vindo=====");
		System.out.println("1 - Adicionar funcionario");
		System.out.println("2 - Mostrar funcionario");
		System.out.println("3 - Encerrar");
		
		String verificador = sc.next();
		switch(verificador){
			case"1":
				subMenu();
				menu();
				break;
			case"2":
				for(Employee c : employeeList) {
					System.out.println(c);
				}
				menu();
				break;
			case"3":
				System.out.println("encerrar");
				break;
		}
	}
	
	public void subMenu() {
		System.out.println("Employee data:");
		System.out.print("Outsourced (y/n)? ");
		sc.nextLine();
		String verificador = sc.nextLine();
		if(verificador.equals("n")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			employee = new Employee(name, hours, valuePerHour);
			employeeList.add(employee);
		}else if(verificador.equals("y")) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Additional charge: ");
			Double additionalCharge = sc.nextDouble();
			
			employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
			employeeList.add(employee);
		}else {
			System.out.println("Erro");
		}
	}
}
