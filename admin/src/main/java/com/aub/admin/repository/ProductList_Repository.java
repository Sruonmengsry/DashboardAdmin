package com.aub.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aub.admin.model.ProductList_Model;

public interface  ProductList_Repository extends JpaRepository<ProductList_Model, Long> {
    
}
