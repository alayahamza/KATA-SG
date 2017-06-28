package com.kata.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.kata.entities.*;

@Service
public interface ClientService {
		
	public boolean performOperation(long clientId, Operation operation);
	
	public List<Account> getUserAccount();
}
