package io.justina.h106javareact.adapters.dtos.relative;

import io.justina.h106javareact.domain.entities.enums.Gender;

import java.time.LocalDate;

public record ReadDtoRelative(
        String id,
        String name,
        String surname,
        String dni,
        String email,
        LocalDate dateOfBirth,
        Gender gender,
        String assistedPatientId
) {
}
