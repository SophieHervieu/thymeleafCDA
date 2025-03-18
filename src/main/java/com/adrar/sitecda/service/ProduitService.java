package com.adrar.sitecda.service;

import com.adrar.sitecda.model.Produit;
import com.adrar.sitecda.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Iterable<Produit> getProduit() {
        if(produitRepository.count() == 0) {
            Produit produit = new Produit();
        }
        return produitRepository.findAll();
    }

    public Optional<Produit> getProduitById(Integer id) {
        return produitRepository.findById(id);
    }
}
