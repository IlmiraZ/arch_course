package ru.ilmira;

import java.util.ArrayList;
import java.util.List;


public class Store implements Listened {
     List<String> promoCodes = new ArrayList<>();

     List<Listener> clients = new ArrayList<>();

    public void addPromoCode (String promoCode) {
        this.promoCodes.add(promoCode);
        notifyManagers();
    }
   public void removePromoCode (String promoCode) {
        this.promoCodes.remove(promoCode);
        notifyManagers();
    }

    public void addManager(Listener listener) {
        this.clients.add(listener);
    }

    public void removeManager(Listener listener) {
        this.clients.remove(listener);
    }

    public void notifyManagers() {
        for (Listener listener : clients) {
            listener.handleEvent(this.promoCodes);
        }
    }
}
