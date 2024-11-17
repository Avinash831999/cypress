package com.verizon.mock_druid_service;

import org.springframework.stereotype.Service;

@Service
public class DruidService {

    public String getDruidData(){
        return "Druid data from Mock API";
    }

}
