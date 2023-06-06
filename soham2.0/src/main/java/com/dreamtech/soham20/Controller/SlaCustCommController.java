package com.dreamtech.soham20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dreamtech.soham20.model.SlaCustComm;
import com.dreamtech.soham20.service.SlaCustCommService;

import java.util.List;

@RestController
@RequestMapping("/sla_custcomm")
@CrossOrigin(origins = "http://localhost:3000")
public class SlaCustCommController {

    private final SlaCustCommService slaCustCommService;

    @Autowired
    public SlaCustCommController(SlaCustCommService slaCustCommService) {
        this.slaCustCommService = slaCustCommService;
    }

    @GetMapping
    public List<SlaCustComm> getAllSlaCustComm() {
        return slaCustCommService.getAllSlaCustComm();
    }

    @GetMapping("/{clientId}/{customerCode}")
    public   ResponseEntity<SlaCustComm> getSlaCustCommById(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode
           ) {
    	SlaCustComm values =slaCustCommService.getSlaCustCommById(clientId, customerCode);
    	 if (values != null) {
             return new ResponseEntity<>(values, HttpStatus.OK);
         } else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
     
    }

    @PostMapping
    public SlaCustComm createSlaCustComm(@RequestBody SlaCustComm slaCustComm) {
        return slaCustCommService.createSlaCustComm(slaCustComm);
    }

    @PutMapping("/{clientId}/{customerCode}")
    public SlaCustComm updateSlaCustComm(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode,
            @RequestBody SlaCustComm slaCustComm) {
        return slaCustCommService.updateSlaCustComm(clientId, customerCode ,slaCustComm);
    }

    @DeleteMapping("/{clientId}/{customerCode}")
    public void deleteSlaCustComm(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode) {
        slaCustCommService.deleteSlaCustComm(clientId, customerCode);
    }
}
