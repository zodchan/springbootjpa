package com.example.demoapp.service;

import com.example.demoapp.entity.NumberEntity;
import com.example.demoapp.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RestService {

    @Autowired
    NumberRepository numberRepository ;

    public NumberEntity add(NumberEntity numberEntity){
        int result = numberEntity.getA() + numberEntity.getB();

        numberEntity.setResult(result);
        numberRepository.save(numberEntity);
        return numberEntity;

    }
}
