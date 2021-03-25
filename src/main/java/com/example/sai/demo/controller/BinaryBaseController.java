package com.example.sai.demo.controller;

import com.example.sai.demo.dal.BinaryRepository;
import com.example.sai.demo.model.BinaryModel;
import com.example.sai.demo.service.BinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BinaryBaseController {

    @Autowired
    BinaryRepository repo;

    @PostMapping("/inputInteger")
    public BinaryModel inputInteger(@RequestBody BinaryModel inputString){
        BinaryService binaryService=new BinaryService();
        String opString = binaryService.converttoInteger(Integer.parseInt(inputString.getInputInteger()));
        inputString.setResultInteger(opString);
        repo.save(inputString);
        return inputString;
    }

    @GetMapping("/getall")
    public List<BinaryModel> getIntegerList(){
        return repo.findAll();
    }

    @GetMapping("/binaryinputtable/{id}")
    public Optional<BinaryModel> getIntegerInput(@PathVariable int id){
        return repo.findById(id);
    }
}
