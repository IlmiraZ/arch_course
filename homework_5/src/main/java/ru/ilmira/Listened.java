package ru.ilmira;

public interface Listened {
    void addManager(Listener listener);
    void removeManager(Listener listener);
    void notifyManagers();
}
