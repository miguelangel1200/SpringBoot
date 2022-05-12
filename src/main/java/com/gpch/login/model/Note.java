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
@Table(name = "notes")

public class Note {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcourses")
    private int id;
    @Column(name = "name_course")
    @NotEmpty(message = "*Please provide a course name")
    private String name_course;
    @Column(name = "description")
    @NotEmpty(message = "*Please provide a description")
    private String description;
    @Column(name = "price_course")
    @NotEmpty(message = "*Please provide a price")
    private Double price_course;
    @Column(name = "image")
    private String image;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "users", referencedColumnName = "id")
    private int users_user_id;
}
