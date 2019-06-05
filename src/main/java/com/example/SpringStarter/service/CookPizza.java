package com.example.SpringStarter.service;

import org.springframework.stereotype.Service;

@Service
public class CookPizza implements ICookDish {


    @Override
    public String cook() {
        return "Fresh pizza from the oven!";
    }
}
