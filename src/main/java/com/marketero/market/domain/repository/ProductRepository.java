package com.marketero.market.domain.repository;

import com.marketero.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProduct(int cuantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
