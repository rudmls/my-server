package fr.ruddymonlouis;


import fr.ruddymonlouis.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class TemporaryData implements CommandLineRunner {

    public static List<User> users = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        users.addAll(List.of(
                        User.builder()
                                .firstName("Ruddy")
                                .lastName("Monlouis")
                                .createAt(LocalDate.of(2022, 3,1))
                                .build(),
                        User.builder()
                                .firstName("David")
                                .lastName("Chartelain")
                                .createAt(LocalDate.of(2022, 5, 1))
                                .build()
                )
        );
    }

}
