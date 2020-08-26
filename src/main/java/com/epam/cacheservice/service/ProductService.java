package com.epam.cacheservice.service;

import com.epam.cacheservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProductService {

    public boolean isProductAvailable(Product product)
    {
       return slowMethodEmulatedRequest(product);
    }

    private boolean slowMethodEmulatedRequest(Product product)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Random().nextInt(11) > 5;
    }


}
