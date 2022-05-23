package ru.ilmira;

public class AuthForm {
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;
    private final String address;
    private final String email;
    private final String city;
    private final String country;
    private final String language;


    AuthForm(AuthFormBuilder formBuilder) {
        this.firstName = formBuilder.firstName;
        this.lastName = formBuilder.lastName;
        this.userName = formBuilder.userName;
        this.password = formBuilder.password;
        this.address = formBuilder.address;
        this.email = formBuilder.email;
        this.city = formBuilder.city;
        this.country = formBuilder.country;
        this.language = formBuilder.language;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" FirstName: ");
        sb.append(firstName);
        sb.append("\n LastName: ");
        sb.append(lastName);
        sb.append("\n UserName: ");
        sb.append(userName);
        sb.append("\n Password: ");
        sb.append(password);

        if (this.address != null) {
            sb.append("\n Address: ");
            sb.append(address);
        }
        if (this.email != null) {
            sb.append("\n Email: ");
            sb.append(email);
        }
        if (this.city != null) {
            sb.append("\n City: ");
            sb.append(city);
        }
        if (this.country != null) {
            sb.append("\n Country: ");
            sb.append(country);
        }
        if (this.language != null) {
            sb.append("\n Language: ");
            sb.append(language);
        }

        return sb.toString();
    }
}
