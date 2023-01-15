package model.service;

public class BrazilTaxService implements TaxService{

	@Override
	public Double tax(double amount) {
		if(amount <= 100) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}

}
