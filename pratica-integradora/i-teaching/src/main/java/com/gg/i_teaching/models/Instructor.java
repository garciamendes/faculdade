package com.gg.i_teaching.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "instructors")
@Table(name = "instructors")
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 45)
    private int rg;

    private String name;

    private LocalDate birth;

    private Integer titration;

    private LocalDateTime created;

    @OneToMany(mappedBy = "instructor")
    private List<Class> classes;
}
