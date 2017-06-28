package com.kata.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id
	private long id;
	
	@OneToMany
	private List<Operation> ops;
	
	private double amount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Operation> getOps() {
		return ops;
	}

	public void setOps(List<Operation> ops) {
		this.ops = ops;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
