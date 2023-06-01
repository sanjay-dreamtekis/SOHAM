package com.dreamtech.soham20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtech.soham20.Repository.SlaCustCommRepository;
import com.dreamtech.soham20.model.SlaCustComm;
import com.dreamtech.soham20.model.SlaCustCommId;

import java.util.List;
import java.util.Optional;

@Service
public class SlaCustCommService {

    private final SlaCustCommRepository slaCustCommRepository;

    @Autowired
    public SlaCustCommService(SlaCustCommRepository slaCustCommRepository) {
        this.slaCustCommRepository = slaCustCommRepository;
    }

    public List<SlaCustComm> getAllSlaCustComm() {
        return slaCustCommRepository.findAll();
    }

    public  List<SlaCustComm> getSlaCustCommById(String clientId, String customerCode) {
        List<SlaCustComm> values=slaCustCommRepository.findBySearchWithKeys(clientId,customerCode);
      //  System.out.println("###############################################"+values);
        // return slaCustCommRepository.findById(new SlaCustCommId(clientId, customerCode)).orElse(null);
        return values;
    }


	public SlaCustComm createSlaCustComm(SlaCustComm slaCustComm) {
        return slaCustCommRepository.save(slaCustComm);
    }

    public SlaCustComm updateSlaCustComm(String clientId, String customerCode) {
        SlaCustComm existingSlaCustComm = slaCustCommRepository.findById(new SlaCustCommId(clientId, customerCode)).orElse(null);
        if (existingSlaCustComm != null) {
   
        	return slaCustCommRepository.save(existingSlaCustComm);
        }
        return null;
    }

    public void deleteSlaCustComm(String clientId, String customerCode) {
        slaCustCommRepository.deleteById(new SlaCustCommId(clientId, customerCode));
    }
}
