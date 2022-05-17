package ru.ilmira;

public class AuthFormBuilder {
    protected final String firstName;
    protected final String lastName;
    protected final String userName;
    protected final String password;
    protected String address;
    protected String email;
    protected String city;
    protected String country;
    protected String language;

    public AuthFormBuilder(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public AuthFormBuilder address(String address) {
        this.address = address;
        return this;
    }

    public AuthFormBuilder email(String email) {
        this.email = email;
        return this;
    }

    public AuthFormBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AuthFormBuilder country(String country) {
        this.country = country;
        return this;
    }

    public AuthFormBuilder language(String language) {
        this.language = language;
        return this;
    }

    public AuthForm build() {
        return new AuthForm(this);
    }
}
