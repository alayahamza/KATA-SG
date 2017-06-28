package com.kata.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operation {

	@Id
	private long id;
	
	private double value;
	
	
}
