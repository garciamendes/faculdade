package com.gg.i_teaching.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gg.i_teaching.dto.InstructorDTO;
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
    private String rg;

    private String name;

    private LocalDate birth;

    private Integer titration;

    private LocalDateTime created;

    @OneToMany(mappedBy = "instructor")
    @JsonManagedReference
    private List<Class> classes;

    public Instructor(InstructorDTO data) {
        this.rg = data.rg();
        this.name = data.name();
        this.birth = data.birth();
        this.titration = data.titration();
    }
}
