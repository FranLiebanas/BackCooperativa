package com.fran.cooperativa.backend.domain.port;

import com.fran.cooperativa.backend.domain.model.Product;

public interface IProductRepository {
    Product save (Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
}

