package ru.ilmira;

public class Asus implements Laptop {
    public String description() {
        return "ASUS ROG G703";
    }

    public String screen() {
        return "17.3\" (1920x1080) IPS";
    }

    public String processor() {
        return "Intel Core i9 8950HK (6x2.90 ГГц)";
    }

    public String memory() {
        return "RAM 32 ГБ (266 МГц), SSD 1.5 ТБ";
    }

    public String videoCard() {
        return "NVIDIA GeForce RTX 2080 8 ГБ";
    }

    public String operatingSystem() {
        return "Windows 10 Home";
    }
}
