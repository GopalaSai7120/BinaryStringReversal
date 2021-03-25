package com.example.sai.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BinaryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String inputInteger;
    private String resultInteger;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInputInteger() {
        return inputInteger;
    }

    public void setInputInteger(String inputInteger) {
        this.inputInteger = inputInteger;
    }

    public String getResultInteger() {
        return resultInteger;
    }

    public void setResultInteger(String resultInteger) {
        this.resultInteger = resultInteger;
    }
}
