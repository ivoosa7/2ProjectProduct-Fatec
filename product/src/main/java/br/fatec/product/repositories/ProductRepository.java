package br.fatec.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.product.entities.Product;

public interface ProductRepository  extends  JpaRepository<Product, Long>{
    
}
