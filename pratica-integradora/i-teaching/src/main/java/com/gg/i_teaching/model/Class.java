package com.gg.i_teaching.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gg.i_teaching.dto.ClassDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity(name = "classes")
@Table(name = "classes")
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime hours;

    private int duration;

    private LocalDate start_date;

    private LocalDate end_date;

    @ManyToOne
    @JsonBackReference
    private Instructor instructor;

    private LocalDateTime created;

    public Class(ClassDTO data, Instructor instructor) {
        this.hours = data.hours();
        this.duration = data.duration();
        this.start_date = data.startDate();
        this.end_date = data.endDate();
        this.instructor = instructor;
    }
}
