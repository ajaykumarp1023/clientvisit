package com.lws.cloud.controller;

import com.lws.cloud.model.ClientVisit;
import com.lws.cloud.repository.ClientVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloResource {
    private ClientVisitRepository clientVisitRepository;
    @Autowired
    public HelloResource(ClientVisitRepository clientVisitRepository) {
        this.clientVisitRepository = clientVisitRepository;
    }

    @GetMapping("/visits")
    public ResponseEntity<List<ClientVisit>> getVisits(){
        List<ClientVisit> visitorList = new ArrayList<>();
        visitorList = clientVisitRepository.findAll();
        if (visitorList.isEmpty()){
            return new ResponseEntity<List<ClientVisit>>(visitorList, HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<List<ClientVisit>>(visitorList,HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Azure";
    }
}
