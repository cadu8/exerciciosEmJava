package entities;
//subclasse
public class Individual extends TaxPayer {
	private Double healthExpenditures;
	
	//construtores
	public Individual() {
		super();
	}
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	//getters e setters
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	//metodos
	@Override
	public double tax() { //metodo para calcular a taxa de juros
		if(anualIncome < 20000) {
			if(healthExpenditures != 0) {
				return ((anualIncome * 0.15) - (healthExpenditures *0.5));
			}else {
				return (anualIncome*0.15);
			}
		}else{
			if(healthExpenditures != 0) {
				return ((anualIncome * 0.25) - (healthExpenditures *0.5));
			}else {
				return (anualIncome*0.15);
			}
		}
	}
}
