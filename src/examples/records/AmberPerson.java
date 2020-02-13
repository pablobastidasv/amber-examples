package examples.records;

import java.time.LocalDate;

record AmberPerson(
        String firstName,
        String lastName,
        LocalDate dateOfBirth
        ) {}
