package ru.ilmira;

import java.util.HashMap;
import java.util.Map;

public class ProductIdentityMap {

    private static final Map<Long, Product> PRODUCT_MAP = new HashMap<>();

    public ProductIdentityMap() {
    }

    public static Product getProduct(Long id) {

        return PRODUCT_MAP.get(id);
    }

    public static void addProduct(Product product) {
        PRODUCT_MAP.put(product.getId(), product);
    }
}
