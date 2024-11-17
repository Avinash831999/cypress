package com.verizon.mock_druid_service.controller;

import com.verizon.mock_druid_service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock-service")
public class druidcontroller {

    @Autowired
    DruidService service;


    @GetMapping("/getmockdata")
    public String getDruidData(){
        return service.getDruidData();
    }

}
