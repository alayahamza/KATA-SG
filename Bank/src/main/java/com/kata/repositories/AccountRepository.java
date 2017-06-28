package com.kata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kata.entities.*;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
