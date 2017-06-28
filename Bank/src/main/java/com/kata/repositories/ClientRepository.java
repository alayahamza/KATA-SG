package com.kata.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kata.entities.*;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	

}
