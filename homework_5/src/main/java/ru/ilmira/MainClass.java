package ru.ilmira;

public class MainClass {
    public static void main(String[] args) {
        Store store = new Store();
        String discount1 = "Скидка на обувь";
        String discount2 = "Скидка на продукты питания";
        String discount3 = "Скидка на спортивные товары";

        store.addPromoCode(discount1);
        store.addPromoCode(discount2);

        Listener client1 = new Client("Sofiya");
        Listener client2 = new Client("Emiliya");

        store.addManager(client1);
        store.addManager(client2);

        store.addPromoCode(discount3);

        store.removePromoCode(discount3);

    }
}
