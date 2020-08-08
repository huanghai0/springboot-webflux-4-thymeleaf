package org.spring.springboot.controller;


import org.spring.springboot.domain.Product;
import org.spring.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/api/product", method = RequestMethod.GET)
    public List<Product> findAllProduct() {
        return productService.findAllProduct();
    }

    @RequestMapping(value = "/api/product/{pid}", method = RequestMethod.GET)
    public Product findOneProduct(@PathVariable("pid") int pid) {
        return productService.findByPid(pid);
    }

    @RequestMapping(value = "/api/product", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @RequestMapping(value = "/api/product", method = RequestMethod.PUT)
    public void modifyProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @RequestMapping(value = "/api/product/{pid}", method = RequestMethod.DELETE)
    public void modifyProduct(@PathVariable("pid") int pid) {
        productService.deleteProduct(pid);
    }

}
