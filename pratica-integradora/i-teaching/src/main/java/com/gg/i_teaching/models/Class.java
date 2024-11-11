package com.gg.i_teaching.models;

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
    @JoinColumn(name = "instrutor_id")
    private Instructor instructor;

    private LocalDateTime created;
}
