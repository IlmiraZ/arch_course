package ru.ilmira;

public class FacadeLaptop {
    private final Apple apple;
    private final Asus asus;
    private final Dell dell;

    public FacadeLaptop() {
        apple = new Apple();
        asus = new Asus();
        dell = new Dell();
    }

    public String operatingSystemApple() {
        return apple.operatingSystem();
    }

    public String operatingSystemAsus() {
        return asus.operatingSystem();
    }

    public String operatingSystemDell() {
        return dell.operatingSystem();
    }
}
