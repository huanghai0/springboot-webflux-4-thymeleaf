package org.spring.springboot.controller.web;

import org.spring.springboot.domain.Product;
import org.spring.springboot.service.MaterOutService;
import org.spring.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private static final String PROD_FORM_PATH_NAME = "productForm";
    private static final String PROD_LIST_PATH_NAME = "productList";
    private static final String PROD_FORM_UPDATE = "productFormUpdate";
    private static final String REDIRECT_TO_PROD_URL = "redirect:/product";

    @Autowired
    private ProductService productService;
    @Autowired
    private MaterOutService materOutService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProductList(ModelMap map) {
        map.addAttribute("productList", productService.findAllProduct());
        return PROD_LIST_PATH_NAME;
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createProdForm(ModelMap map) {
        map.addAttribute("product", new Product());
        map.addAttribute("materList", materOutService.findAllMater());
        map.addAttribute("action", "create");
        return PROD_FORM_PATH_NAME;
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postBook(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return REDIRECT_TO_PROD_URL;
    }

    @RequestMapping(value = "/update/{pid}", method = RequestMethod.GET)
    public String getProduct(@PathVariable int pid, ModelMap map) {
        map.addAttribute("product", productService.findByPid(pid));
        map.addAttribute("action", "update");
        return PROD_FORM_UPDATE;
    }

    /**
     * 更新 Product
     * 处理 "/update" 的 PUT 请求，用来更新 Book 信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putProduct(@ModelAttribute Product product) {
        productService.updateProduct(product);
        return REDIRECT_TO_PROD_URL;
    }


    @RequestMapping(value = "/delete/{pid}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable("pid") int pid) {
        productService.deleteProduct(pid);
        return REDIRECT_TO_PROD_URL;
    }

}
