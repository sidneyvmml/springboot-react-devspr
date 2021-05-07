package com.devsuperior.devsuperior.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

<<<<<<< HEAD
import com.devsuperior.devsuperior.dto.SaleSuccessDTO;
=======
>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307
import com.devsuperior.devsuperior.dto.SaleSumDTO;
import com.devsuperior.devsuperior.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperior.devsuperior.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
<<<<<<< HEAD
	
	@Query("SELECT new com.devsuperior.devsuperior.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals) ) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
=======
>>>>>>> 9403ee4f6d2f0d2958e27dcc6f01538d93fac307

}
