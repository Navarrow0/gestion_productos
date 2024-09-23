package com.alexisnavarro.gestion_productos.product.repository;

import com.alexisnavarro.gestion_productos.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
