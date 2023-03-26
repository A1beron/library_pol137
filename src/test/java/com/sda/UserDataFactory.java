package com.sda;

import com.sda.model.Address;
import com.sda.model.User;

import java.util.List;
import java.util.Set;

import static com.sda.model.Role.ADMIN;
import static com.sda.model.Role.USER;

public class UserDataFactory {

    private static final Set<User> exampleUserData = Set.of(
            new User(
                    "Jan",
                    "Nowak",
                    "jano",
                    "jano@gmail.com",
                    "password123",
                    new Address(
                            "Wiejska",
                            "16",
                            "",
                            "01-256"
                    ),
                    List.of(USER, ADMIN)),
            new User(
                    "Test",
                    "Test",
                    "test",
                    "test@gmail.com",
                    "test789",
                    new Address(
                            "Testowa",
                            "10",
                            "2",
                            "01-000"
                    ),
                    List.of(USER))
    );

    public static Set<User> getExampleUserData() {
        return exampleUserData;
    }
}
