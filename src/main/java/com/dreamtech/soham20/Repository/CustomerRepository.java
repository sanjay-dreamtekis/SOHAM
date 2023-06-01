package com.dreamtech.soham20.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dreamtech.soham20.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	
	@Query(value =" SELECT NATIONID  FROM [dbo].[SLA_CUSTOMER]", nativeQuery = true)
	List<String> findBySearchingNationalID();
   
}
