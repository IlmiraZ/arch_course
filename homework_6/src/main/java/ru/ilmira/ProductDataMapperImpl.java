package ru.ilmira;

import java.sql.*;


public class ProductDataMapperImpl implements ProductDataMapper {

    public ProductDataMapperImpl() {
    }

    @Override
    public Product findById(Long id) {
        System.out.println("Execution request");
        try (Connection connection = DbClass.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, title from products where id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Product(resultSet.getLong(1),
                        resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Long insert(Product product) {
        try (Connection connection = DbClass.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products(id, title, price) " +
                    "VALUES (?, ?, ?) RETURNING *");
            preparedStatement.setLong(1, product.getId());
            preparedStatement.setString(2, product.getTitle());
            preparedStatement.setBigDecimal(3, product.getPrice());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getLong("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public boolean update(Product product) {
        try (Connection connection = DbClass.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE products SET title = ?, price = ? where id = ?");
            preparedStatement.setString(1, product.getTitle());
            preparedStatement.setBigDecimal(2, product.getPrice());
            preparedStatement.setLong(3, product.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        try (Connection connection = DbClass.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
            preparedStatement.setLong(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Product getProduct(Long id) {
        Product product = ProductIdentityMap.getProduct(id);
        if (product != null) {
            return product;
        } else {
            Product prod = findById(id);
            ProductIdentityMap.addProduct(prod);
            return prod;
        }
    }
}


