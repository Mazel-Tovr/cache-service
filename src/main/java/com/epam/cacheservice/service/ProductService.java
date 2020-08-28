package com.epam.cacheservice.service;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProductService {

    public boolean isProductAvailable(long productId) {
        return slowMethodEmulatedRequest(productId);
    }

    private boolean slowMethodEmulatedRequest(long productId) {
        try {
            Thread.sleep(300);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Random().nextInt(11) > 5;
    }


}
