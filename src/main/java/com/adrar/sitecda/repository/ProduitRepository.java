package com.adrar.sitecda.repository;

import com.adrar.sitecda.model.Produit;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProduitRepository extends CrudRepository<Produit, Integer> {
    Optional<Produit> findById(Integer id);
}
