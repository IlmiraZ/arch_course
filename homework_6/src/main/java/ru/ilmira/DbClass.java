package ru.ilmira;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbClass {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:./homework_6/db/ShopRu.db");
    }
}
