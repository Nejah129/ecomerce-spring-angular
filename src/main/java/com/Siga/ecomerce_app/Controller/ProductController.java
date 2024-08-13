package com.Siga.ecomerce_app.Controller;

import com.Siga.ecomerce_app.Entity.Product;
import com.Siga.ecomerce_app.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private  ProductServiceImpl productService;
    @PostMapping("/add")
    public Product addNewProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

}
