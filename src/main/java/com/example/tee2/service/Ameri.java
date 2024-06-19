package com.example.tee2.service;

import org.springframework.stereotype.Component;

@Component
public class Ameri {
    String strTaste = "아메리 - 깔끔";
    String strPrice = "3000";

    @Override
    public String toString() {
        return "Ameri [strTaste=" + strTaste + ", strPrice=" + strPrice + "]";

    }

}
