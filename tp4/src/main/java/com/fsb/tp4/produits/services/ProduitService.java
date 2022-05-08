package com.fsb.tp4.produits.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsb.tp4.web.models.Produit;

public interface ProduitService {
	
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	Page<Produit> getAllProduitsParPage(int page, int size);

}
