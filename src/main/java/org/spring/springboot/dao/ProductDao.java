package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;

import org.spring.springboot.domain.Product;

import java.util.List;

public interface ProductDao {


    List<Product> findAllProduct();

    Product findByPid(@Param("pid") int pid);

    Long saveProduct(Product product);

    Long updateProduct(Product product);

    Long deleteProduct(int pid);
}
