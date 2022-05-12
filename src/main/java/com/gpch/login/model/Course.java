package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idnotes")
    private int id;
    @Column(name = "note_1")
    @NotEmpty(message = "*Please provide a note")
    private Double note_1;
    @Column(name = "note_2")
    @NotEmpty(message = "*Please provide a note")
    private Double note_2;
    @Column(name = "note_3")
    @NotEmpty(message = "*Please provide a note")
    private Double note_3;
    @Column(name = "note_4")
    @NotEmpty(message = "*Please provide a note")
    private Double note_4;
    @Column(name = "note_5")
    @NotEmpty(message = "*Please provide a note")
    private Double note_5;
    @Column(name = "avarage")
    @NotEmpty(message = "*Please provide a note")
    private Double avarage;
    
    
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "courses", referencedColumnName = "id")
    private int courses_idcourses;
}
