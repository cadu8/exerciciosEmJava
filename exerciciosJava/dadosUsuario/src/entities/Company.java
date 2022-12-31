package entities;
//subclasse
public class Company extends TaxPayer{
	private int numberOfEmployees;
	
	//construtores
	public Company() {
		super();
	}
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	//getters e setters
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	//metodos
	@Override
	public double tax() { //metodo para calcular a taxa de juros
		if(numberOfEmployees > 10) {
			return (anualIncome*0.14);
		}else {
			return (anualIncome*0.16);
		}
	}

}
