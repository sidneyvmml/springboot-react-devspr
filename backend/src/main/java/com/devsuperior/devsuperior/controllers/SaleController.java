package com.devsuperior.devsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.devsuperior.dto.SaleDTO;
<<<<<<< HEAD
import com.devsuperior.devsuperior.dto.SaleSuccessDTO;
=======
>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307
import com.devsuperior.devsuperior.dto.SaleSumDTO;
import com.devsuperior.devsuperior.services.SaleService;

@RestController
<<<<<<< HEAD
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);

	}

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);

	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		List<SaleSuccessDTO> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);

=======
@RequestMapping(value="/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
	Page<SaleDTO> list = service.findAll(pageable);
	return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value="/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
	List<SaleSumDTO> list = service.amountGroupedBySeller();
	return ResponseEntity.ok(list);
		
>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307
	}

}
