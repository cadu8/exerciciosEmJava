package entities;
//classe mae
public abstract class TaxPayer {
	private String name;
	protected Double anualIncome;
	
	//construtores
	public TaxPayer() {
	}
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	//getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnualIncome() {
		return anualIncome;
	}
	//metodos
	public abstract double tax();//meto abstrato utilizado nas calsses individual e companny
	
	public String toString() {//metodo para escrever na tela
		return getName()
				+ " $ "
				+ String.format("%.2f%n", tax());
	}
	
}
