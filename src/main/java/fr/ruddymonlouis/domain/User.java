package fr.ruddymonlouis.domain;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
public class User {

    @Builder.Default
    private final UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private LocalDate createAt;

}
