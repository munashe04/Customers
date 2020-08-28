package com.example.Customerssss;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<Customer,Integer> {
}
