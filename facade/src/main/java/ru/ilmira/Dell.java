package ru.ilmira;

public class Dell implements Laptop {
    public String description() {
        return "DELL XPS 15 7590";
    }

    public String screen() {
        return "15.6\" (3840x2160) IPS";
    }

    public String processor() {
        return "Intel Core i9 9980HK (8x2.40 ГГц)";
    }

    public String memory() {
        return "RAM 32 ГБ (2666 МГц), SSD 1 ТБ";
    }

    public String videoCard() {
        return "NVIDIA GeForce GTX 1650 4 ГБ";
    }

    public String operatingSystem() {
        return "Windows 10 Pro";
    }
}
