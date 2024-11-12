package com.gg.i_teaching.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record ClassDTO(
        LocalTime hours,
        int duration,
        LocalDate startDate,
        LocalDate endDate,
        Long instructorId
) {
}
