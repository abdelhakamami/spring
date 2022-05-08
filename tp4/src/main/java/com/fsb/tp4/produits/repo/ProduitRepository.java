package com.fsb.tp4.produits.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsb.tp4.web.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
