package com.devsuperior.devsuperior.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.devsuperior.dto.SellerDTO;
import com.devsuperior.devsuperior.entities.Seller;
import com.devsuperior.devsuperior.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository reposiroty;
	
	public List<SellerDTO> findAll(){
		List<Seller>  result = reposiroty.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
