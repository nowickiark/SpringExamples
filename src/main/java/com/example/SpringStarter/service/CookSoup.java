package com.example.SpringStarter.service;

import org.springframework.stereotype.Service;

@Service
public class CookSoup implements ICookDish{


    @Override
    public String cook() {
        return "One freshsly cooked chicken soup";
    }
}
