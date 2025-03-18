package com.adrar.sitecda.controller;

import com.adrar.sitecda.model.Produit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("firstname", "Sophie");
        return "index";
    }

    @GetMapping("/produit")
    public String produit(Model model) {
        Produit produit = new Produit("Livre", "Livre de 50 pages", 14.99);
        model.addAttribute("produit", produit);
        return "produit";
    }

    @GetMapping("/helloworld/{firstname}")
    public String helloworld(Model model) {
        model.addAttribute("firstname", "Sophie");
        return "hellofirstname";
    }
}
