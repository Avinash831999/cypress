package com.verizon.druid_db_service.controller;

import com.verizon.druid_db_service.service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/druid-service")
public class druidcontroller {

    @Autowired
    DruidService service;


    @GetMapping("/getdata")
    public String getDruidData(){
        return service.getDruidData();
    }

}
