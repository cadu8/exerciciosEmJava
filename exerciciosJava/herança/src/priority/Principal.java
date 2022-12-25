package priority;

import entities.Account;
import entities.BusinessAcount;
import entities.SaingsAccount;

public class Principal {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "maria", 0.0, 500.0);
		
		//UPCASTING
		//é possivel, pois as subclasses sao uma "conta"
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SaingsAccount(1004, "anna", 0.0, 0.01);
		
		//DOWNCASTING
		//fizemos uma subclasse receber uma superclasse com o esse metodo
		BusinessAcount acc4 = (BusinessAcount)acc2; 
		
		// BusinessAcount acc5 = (BusinessAcount)acc3; ira dar erro, pois o acc3 é um SaingsAccount
		
		if(acc3 instanceof BusinessAcount) {
			//se o que tiver na variavel acc3 for uma instancia de businessAccout, ai sim faça o casting
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(200.0);
		}
		if(acc3 instanceof SaingsAccount) {
			//se o que tiver na variavel acc3 for uma instancia de SaingAccount, ai sim faça o casting
			SaingsAccount acc5 = (SaingsAccount)acc3;
			acc5.updateBalance();
		}
		
		
	}

}
