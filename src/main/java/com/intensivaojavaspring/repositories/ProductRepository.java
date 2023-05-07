package com.intensivaojavaspring.repositories;

import com.intensivaojavaspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
