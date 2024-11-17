package com.verizon.signature_service.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SignatureService {

    public String getSignatyreData(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity= new HttpEntity(null,httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8081/druid-service/getdata", HttpMethod.GET,entity,String.class);

       return responseEntity.getBody();

    }
}
