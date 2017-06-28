package com.kata.services;

import org.springframework.stereotype.Service;
import com.kata.entities.*;
@Service
public interface AccountService {
	
	public double getAmount(long clientId);
	
	public Account performDeposit(long idAccount, double amount);

}
