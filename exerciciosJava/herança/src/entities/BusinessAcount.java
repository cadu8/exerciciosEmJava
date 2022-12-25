package entities;

public class BusinessAcount extends Account {//herança
	
	private Double loanLimit;
	//construtores
	public BusinessAcount() {
		super(); //caso tenha uma logica no construtor padrao, ela sera implementada com o super
	}
	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	//getters e setters
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	//metodos
	public void loan(double amount) {
		if(amount <= loanLimit) {
			deposit(amount);
		}
	}
	//SOBREPOSIÇÃO
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);  //ele ira fazer o metodo withdraw da superclasse e logo apos ira fazer o novo metodo balance -= -2;
		balance -= -2;
	}
}
