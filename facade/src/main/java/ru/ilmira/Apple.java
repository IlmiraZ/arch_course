package ru.ilmira;

public class Apple implements Laptop {
    public String description() {
        return "Apple MacBook Pro 15 Mid 2019";
    }

    public String screen() {
        return "15.4\" (2880x1800) IPS";
    }

    public String processor() {
        return "Intel Core i9 (8x2.40 ГГц)";
    }

    public String memory() {
        return "RAM 32 ГБ (2400 МГц)";
    }

    public String videoCard() {
        return "AMD Radeon Pro 560X 4 ГБ";
    }

    public String operatingSystem() {
        return "macOS";
    }
}
