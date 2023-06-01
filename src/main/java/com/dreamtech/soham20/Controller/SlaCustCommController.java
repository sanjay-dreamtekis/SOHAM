package com.dreamtech.soham20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public  List<SlaCustComm> getSlaCustCommById(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode) {
    	 List<SlaCustComm> values =slaCustCommService.getSlaCustCommById(clientId, customerCode);
    	
        return values;
    }

    @PostMapping
    public SlaCustComm createSlaCustComm(@RequestBody SlaCustComm slaCustComm) {
        return slaCustCommService.createSlaCustComm(slaCustComm);
    }

    @PutMapping("/{clientId}/{customerCode}")
    public SlaCustComm updateSlaCustComm(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode) {
        return slaCustCommService.updateSlaCustComm(clientId, customerCode);
    }

    @DeleteMapping("/{clientId}/{customerCode}/{commode}")
    public void deleteSlaCustComm(
            @PathVariable("clientId") String clientId,
            @PathVariable("customerCode") String customerCode,
            @PathVariable("commode") String commode) {
        slaCustCommService.deleteSlaCustComm(clientId, customerCode);
    }
}
