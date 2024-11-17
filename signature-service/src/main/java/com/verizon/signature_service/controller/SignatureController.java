package com.verizon.signature_service.controller;

import com.verizon.signature_service.service.SignatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping("/signature-service")
public class SignatureController {

    @Autowired
    SignatureService service;

    @GetMapping("/signature")
    public String getSignaturedata(){
        System.out.println("hellwo "+ new Date());
        return service.getSignatyreData();
    }


}
