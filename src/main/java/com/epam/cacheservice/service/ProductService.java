package com.epam.cacheservice.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProductService {

    private final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Cacheable(value = "product" ,key = "#productId")
    public boolean isProductAvailable(long productId) {
        return slowMethodEmulatedRequest(productId);
    }

    private boolean slowMethodEmulatedRequest(long productId) {
        try {
            Thread.sleep(300);
            logger.debug("Fake request to get product availability");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Random().nextInt(11) > 5;
    }


}
