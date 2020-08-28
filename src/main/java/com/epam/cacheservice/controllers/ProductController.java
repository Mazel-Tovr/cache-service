package com.epam.cacheservice.controllers;

import com.epam.cacheservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public boolean isProductAvailable(@RequestParam long productId)
    {

       return productService.isProductAvailable(productId);

    }

}
