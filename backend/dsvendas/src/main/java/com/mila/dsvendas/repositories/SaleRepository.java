package com.mila.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mila.dsvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long>{

	
}
