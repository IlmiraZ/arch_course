package ru.ilmira;


public class Registry {
    private static final Registry instance = new Registry();

    public static Registry getInstance() {
        return instance;
    }

    protected ProductDataMapperImpl mapper = new ProductDataMapperImpl();

    public static ProductDataMapperImpl getProductMapper() {
        return getInstance().mapper;
    }
}
