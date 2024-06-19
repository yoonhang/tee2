package com.example.tee2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.tee2.service.Ameri;
import com.example.tee2.service.Cappu;
import com.example.tee2.service.Latte;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Counter {

    Ameri ameri;
    Latte latte;
    Cappu cappu;

    @Autowired
    public Counter(Ameri am, Latte la, Cappu ca) {
        this.ameri = am;
        this.latte = la;
        this.cappu = ca;
    }

    // @PostMapping("/tee2/morning")
    @RequestMapping("/tee2/morning")
    public String doOrder(HttpServletRequest request) {

        String strTaste = "";
        String strPrice = "";
        String strReturn = "";

        String strMenu = request.getParameter("tee2");

        if (strMenu == null) {
            System.out.println(strMenu);
            return "Invalid menu selection...";
        }

        if (strMenu.equals("1")) {
            Ameri ameri = new Ameri();
            strReturn = ameri.toString();
        } else if (strMenu.equals("2")) {
            Cappu cappu = new Cappu();
            strReturn = cappu.toString();
        } else if (strMenu.equals("3")) {
            Latte latte = new Latte();
            strReturn = latte.toString();
        }

        return strReturn;
    }
}
