package ru.ilmira;


public interface ProductDataMapper {

    Product findById(Long id);

    Long insert(Product product);

    boolean update(Product product);

    boolean deleteById(Long id);


}
