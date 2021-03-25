package com.example.sai.demo.service;

public class BinaryService {
    public String converttoInteger(int binaryInput){
        StringBuilder inputString = new StringBuilder();
        inputString.append(String.format("%8s", Integer.toBinaryString(binaryInput)).replace(' ', '0'));
        Integer i=Integer.parseInt(inputString.reverse().toString(),2);
        return i.toString();
    }
}
