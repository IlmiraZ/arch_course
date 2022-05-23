package ru.ilmira;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Client implements Listener {

    String name;

    public void handleEvent(List<String> promoCode) {
        System.out.println("Уважаемый(ая) " + name + "\nПолучите промокод  " + promoCode + "\nПокупайте с выгодой:)");
        System.out.println("-----------------------------------------------------------------------------");

    }
}
