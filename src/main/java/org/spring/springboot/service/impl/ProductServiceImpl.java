package org.spring.springboot.service.impl;

import org.spring.springboot.dao.ProductDao;
import org.spring.springboot.domain.Product;
import org.spring.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAllProduct();
    }

    @Override
    public Product findByPid(int pid) {
        return productDao.findByPid(pid);
    }

    @Override
    public Long saveProduct(Product product) {
        return productDao.saveProduct(product);
    }

    @Override
    public Long updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Override
    public Long deleteProduct(int pid) {
        return productDao.deleteProduct(pid);
    }
}
