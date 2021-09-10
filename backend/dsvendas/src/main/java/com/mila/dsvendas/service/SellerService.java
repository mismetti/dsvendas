package com.mila.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mila.dsvendas.dto.SellerDTO;
import com.mila.dsvendas.entities.Seller;
import com.mila.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
			
			List<Seller> result = repository.findAll();
			return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		
	}
	
	
}
