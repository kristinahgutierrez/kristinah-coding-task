package com.kristinah.stylecarousel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kristinah.stylecarousel.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
