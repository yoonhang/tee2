package com.example.tee2.service;

import org.springframework.stereotype.Component;

@Component
public class Latte {
    String strTaste = "라떼 - 달콤";
    String strPrice = "5000";

    @Override
    public String toString() {
        return "Latte [strTaste=" + strTaste + ", strPrice=" + strPrice + "]";

    }

}
