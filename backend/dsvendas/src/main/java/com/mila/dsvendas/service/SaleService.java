package com.mila.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mila.dsvendas.dto.SaleDTO;
import com.mila.dsvendas.dto.SellerDTO;
import com.mila.dsvendas.entities.Sale;
import com.mila.dsvendas.entities.Seller;
import com.mila.dsvendas.repositories.SaleRepository;
import com.mila.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
			
			sellerRepository.findAll();
			Page<Sale> result = repository.findAll(pageable);
			return result.map(x -> new SaleDTO(x));
		
	}

}
