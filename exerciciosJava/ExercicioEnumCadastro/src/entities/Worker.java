package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	//associações
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	//construtores
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	//getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//metodos
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance(); //puxou o calendario
		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); //trouxe como data atual a data do contrato 
			int c_year = cal.get(Calendar.YEAR); //separou o ano em uma variavel 
			int c_month = cal.get(Calendar.MONTH); //separou o mes em uma variavel
			
			if(year == c_year && month == c_month) { //verificou o ano e o mes, adicionou a soma
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
}
