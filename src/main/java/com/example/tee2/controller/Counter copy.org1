package com.example.tee2.controller;

import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Counter {

    // @PostMapping("/tee2/morning")
    @RequestMapping("/tee2/morning")
    public String doOrder(HttpServletRequest request) {

        String strTaste = "";
        String strPrice = "";
        String strMenu = request.getParameter("tee2");

        if (strMenu == null) {
            System.out.println(strMenu);
            return "Invalid menu selection...";

        }

        if (strMenu.equals("1")) {
            strTaste = "아메리 - ㅋㅋ";
            strPrice = "3000";
        } else if (strMenu.equals("2")) {
            strTaste = "바닐라 - ㅋㅋ";
            strPrice = "4000";
        } else if (strMenu.equals("3")) {
            strTaste = "카푸 -- ㅋㅋ";
            strPrice = "5000";
        }

        return strTaste + " : " + strPrice;

    }

}