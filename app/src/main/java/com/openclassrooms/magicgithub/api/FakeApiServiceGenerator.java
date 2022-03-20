package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://adorable-avatars.broken.services/1.png"),
            new User("002", "Paul", "https://adorable-avatars.broken.services/2.png"),
            new User("003", "Phil", "https://adorable-avatars.broken.services/3.png"),
            new User("004", "Guillaume", "https://adorable-avatars.broken.services/4.png"),
            new User("005", "Francis", "https://adorable-avatars.broken.services/5.png"),
            new User("006", "George", "https://adorable-avatars.broken.services/6.png"),
            new User("007", "Louis", "https://adorable-avatars.broken.services/7.png"),
            new User("008", "Mateo", "https://adorable-avatars.broken.services/8.png"),
            new User("009", "April", "https://adorable-avatars.broken.services/9.png"),
            new User("010", "Louise", "https://adorable-avatars.broken.services/10.png"),
            new User("011", "Elodie", "https://adorable-avatars.broken.services/11.png"),
            new User("012", "Helene", "https://adorable-avatars.broken.services/12.png"),
            new User("013", "Fanny", "https://adorable-avatars.broken.services/13.png"),
            new User("014", "Laura", "https://adorable-avatars.broken.services/14.png"),
            new User("015", "Gertrude", "https://adorable-avatars.broken.services/15.png"),
            new User("016", "Chloé", "https://adorable-avatars.broken.services/16.png"),
            new User("017", "April", "https://adorable-avatars.broken.services/17.png"),
            new User("018", "Marie", "https://adorable-avatars.broken.services/18.png"),
            new User("019", "Henri", "https://adorable-avatars.broken.services/19.png"),
            new User("020", "Rémi", "https://adorable-avatars.broken.services/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://adorable-avatars.broken.services/21.png"),
            new User("022", "Geoffrey", "https://adorable-avatars.broken.services/22.png"),
            new User("023", "Simon", "https://adorable-avatars.broken.services/23.png"),
            new User("024", "André", "https://adorable-avatars.broken.services/24.png"),
            new User("025", "Leopold", "https://adorable-avatars.broken.services/25.png")
    );
}
