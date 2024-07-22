package com.aub.admin.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aub.admin.repository.ProductList_Repository;



@Service("productService")
public class ProductList_Service {
    @Autowired ProductList_Repository productList_Repository;


    
}
