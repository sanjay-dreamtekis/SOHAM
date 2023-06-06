package com.dreamtech.soham20.paradropC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dreamtech.soham20.paradropC.model.DropDownCountryModel;

@Repository
@EnableJpaRepositories
public interface DropDownCountryRepo extends JpaRepository<DropDownCountryModel, String> {
	

    //@Query(value = "SELECT * FROM [dbo].[SLA_COUNTRY]", nativeQuery = true)
   // List<DropDownCountryModel> findCountryNames();
	
}
