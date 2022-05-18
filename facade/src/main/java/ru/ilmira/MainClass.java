package ru.ilmira;

public class MainClass {
    public static void main(String[] args) {

        FacadeLaptop facadeLaptop = new FacadeLaptop();

        System.out.println(facadeLaptop.operatingSystemApple());
        System.out.println(facadeLaptop.operatingSystemAsus());
        System.out.println(facadeLaptop.operatingSystemDell());
    }
}
