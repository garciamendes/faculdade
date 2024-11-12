package com.gg.i_teaching.dto;

import java.time.LocalDate;

public record InstructorDTO(
        String rg,
        String name,
        LocalDate birth,
        Integer titration
) {
}
