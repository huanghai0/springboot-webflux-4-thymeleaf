package org.spring.springboot.service;

import org.spring.springboot.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();

    Product findByPid(int Pid);

    Long saveProduct(Product product);

    Long updateProduct(Product product);

    Long deleteProduct(int pid);

}
