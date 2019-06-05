package com.example.SpringStarter.controller;

import com.example.SpringStarter.service.ICookDish;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class KitchenControl {

    private ICookDish iCookDish;


    public KitchenControl (@Qualifier("cookSoup") ICookDish iCookDish){
        this.iCookDish = iCookDish;
    }


    public String getDish(){
        return iCookDish.cook();
    }

}
