package Utilities;

import com.kata.entities.Account;

public class AccountUtility {
	
	public static boolean calculateAccount(Account acc, double amount){
		
		
		if (amount > 0) {
			acc.setAmount(acc.getAmount() + amount);
			return true;
		}
		else{
			double realAmount = amount + amount/10;
			if(acc.getAmount()+realAmount<-1000){
				return false;
			}
			else{
				acc.setAmount(acc.getAmount() + amount);
				return true;
			}
		}
		
	}

}
