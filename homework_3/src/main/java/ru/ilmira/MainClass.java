package ru.ilmira;

public class MainClass {

    public static void main(String[] args) {

        AuthForm authFormBuilder = new AuthFormBuilder("Ilmira", "Zalialetdinova",
                "Z_Ilmira", "1234")
                .country("Russia")
                .city("Moscow")
                .address("Borisovka str,5")
                .email("Z.Ilmira@mail.ru")
                .language("russian")
                .build();
        System.out.println(authFormBuilder);
    }
}

