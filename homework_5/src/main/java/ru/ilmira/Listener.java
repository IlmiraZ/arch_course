package ru.ilmira;

import java.util.List;

public interface Listener {
    void handleEvent(List<String> promoCode);
}
