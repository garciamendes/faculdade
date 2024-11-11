package com.gg.i_teaching.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

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

    private Time hours;

    private Integer duration;

    private Date start_date;

    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Instructor instructor;

    private LocalDateTime created;
}
