package com.dreamtech.soham20.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dreamtech.soham20.model.SlaCustComm;
import com.dreamtech.soham20.model.SlaCustCommId;
@Repository
public interface SlaCustCommRepository extends JpaRepository<SlaCustComm, SlaCustCommId> {
	
/*	
	@Query(value = "SELECT * FROM [dbo].[SLA_CUSTCOMM]  WHERE CLIENTID=?1 AND CUSTOMERCODE=?2", nativeQuery = true)
	List<SlaCustComm> findBySearchWithKeys(String clientId,String customerCode);*/

}
