package com.dreamtech.soham20.paramdrop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dreamtech.soham20.paramdrop.model.DropListModel;
import com.dreamtech.soham20.paramdrop.model.DropListModelKey;


@Repository
@EnableJpaRepositories
public interface dropDownRepo extends JpaRepository<DropListModel, DropListModelKey> {

	 @Query("SELECT name FROM DropListModel s WHERE FIELDNAME=?1")
	 List<String> findByNameFiledName(String data);

}
