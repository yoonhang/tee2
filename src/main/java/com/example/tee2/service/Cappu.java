package com.example.tee2.service;

import org.springframework.stereotype.Component;

@Component
public class Cappu {

    String strTaste = "카푸 - 달달";
    String strPrice = "4000";

    @Override
    public String toString() {
        return "Cappu [strTaste=" + strTaste + ", strPrice=" + strPrice + "]";

    }

}
