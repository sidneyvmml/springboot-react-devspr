package com.devsuperior.devsuperior.services;

<<<<<<< HEAD
=======

>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.devsuperior.dto.SaleDTO;
<<<<<<< HEAD
import com.devsuperior.devsuperior.dto.SaleSuccessDTO;
=======
>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307
import com.devsuperior.devsuperior.dto.SaleSumDTO;
import com.devsuperior.devsuperior.entities.Sale;
import com.devsuperior.devsuperior.repositories.SaleRepository;
import com.devsuperior.devsuperior.repositories.SellerRepository;

@Service
public class SaleService {
<<<<<<< HEAD

	@Autowired
	private SaleRepository reposiroty;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = reposiroty.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return reposiroty.amountGroupedBySeller();

	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return reposiroty.successGroupedBySeller();

=======
	
	@Autowired
	private SaleRepository reposiroty;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly=true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale>  result = reposiroty.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return reposiroty.amountGroupedBySeller();
		
>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307
	}

}
