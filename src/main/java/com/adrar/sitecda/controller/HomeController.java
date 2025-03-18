package com.adrar.sitecda.controller;

import com.adrar.sitecda.model.Produit;
import com.adrar.sitecda.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    private ProduitService produitService;

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
    public String helloworld(Model model, @PathVariable String firstname) {
        model.addAttribute("firstname", firstname);
        return "hellofirstname";
    }

    @GetMapping("/produit/{id}")
    public String produit(Model model, @PathVariable Integer id) {
        Produit unProduit = produitService.getProduitById(id).get();
        model.addAttribute("produit", unProduit);
        return "produitbyid";
    }
}
