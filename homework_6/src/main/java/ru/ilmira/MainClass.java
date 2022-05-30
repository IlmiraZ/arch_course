package ru.ilmira;

import java.util.logging.Logger;

public class MainClass {

    private final static Logger log = Logger.getLogger(MainClass.class.getName());

    public static void main(final String... args) {
        ProductDataMapperImpl mapper = Registry.getProductMapper();

        Product product = mapper.findById(1L);
        System.out.println(product.getTitle());

        Product newTitleProduct = mapper.getProduct(1L);
        newTitleProduct.setTitle("AppleProMix");
        System.out.println(newTitleProduct);
    }
}


