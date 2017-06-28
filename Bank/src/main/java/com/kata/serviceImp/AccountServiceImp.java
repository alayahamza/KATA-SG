package com.kata.serviceImp;
import org.springframework.beans.factory.annotation.Autowired;

import com.kata.entities.Account;
import com.kata.entities.Client;
import com.kata.repositories.AccountRepository;
import com.kata.services.*;

import Utilities.AccountUtility;
public class AccountServiceImp implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public double getAmount(long accountId) {
		Account acc = new Account();
		acc = accountRepository.getOne(accountId);
		if(acc != null)
			return acc.getAmount();
		return -2000;
	}

	@Override
	public Account performDeposit(long accountId, double amount) {
		Account acc = new Account();
		acc = accountRepository.getOne(accountId);
		if(AccountUtility.calculateAccount(acc, amount)){
			accountRepository.save(acc);
		}
		
		return acc;
	}

}
