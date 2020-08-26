package com.epam.cacheservice.service;

import com.epam.cacheservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Service
public class ProductService {

    public boolean isProductAvailable(long productId)
    {
       return slowMethodEmulatedRequest(productId);
    }

    private boolean slowMethodEmulatedRequest(long productId)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Random().nextInt(11) > 5;
    }


}
