package ru.ilmira.rest;

import java.time.LocalDateTime;

public class ErrDto {

    private String message;

    private final LocalDateTime dateTime;

    public ErrDto() {
        this.dateTime = LocalDateTime.now();
    }

    public ErrDto(String message) {
        this();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
