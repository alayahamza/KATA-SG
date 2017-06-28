package com.kata.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	private long id;
	
	@OneToMany
	private List<Account> accounts;
	
	@OneToMany
	private List<Operation> operations;

}
