package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.enums.WorkerLevel;


public class Menu {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);
	Worker worker;
	HourContract contract;
	
	public Menu() {
		
	}
	
	public void mostrarMenu() throws Throwable {
		menuPrincipal();
		funcoes();
	}
	
	public void menuPrincipal() {
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		worker = new Worker(workerName, WorkerLevel.valueOf(workLevel), baseSalary, new Departament(departmentName));
	}
	
	public void funcoes() throws Throwable {
		System.out.println();
		System.out.println("ADICIONAR CONTRATO: 1");
		System.out.println("CALCULAR SALARIO: 2");
		System.out.println("ENCERRAR: 3");
		sc.nextLine();
		String ferramentas = sc.nextLine();
		
		switch(ferramentas) {
		case "1":
			contrato();
			funcoes();
			break;
		case "2":
			totalSalary();
			funcoes();
			break;
		case "3":
			System.out.println("PROGRAMA ENCERRADO");
			break;
		}
	}
	
	public void contrato() throws ParseException {
		System.out.println("Enter contract:");
		System.out.print("Date (DD/MM/YYYY): ");
		Date contractDate = sdf.parse(sc.next());
		System.out.print("Value per hour: ");
		double valuePerHour = sc.nextDouble();
		System.out.print("Duration (hours): ");
		int hour = sc.nextInt();
		
		contract = new HourContract(contractDate, valuePerHour, hour);
	}
	
	public void totalSalary() {
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month) ));
	}
}
