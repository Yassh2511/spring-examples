package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class IdProof {
    String idNumber="ABC20";

    void setidNumber(String idNumber){
        this.idNumber=idNumber;
    }

    void getidNumer(String idNumber){
        this.idNumber=idNumber;
    }
}
