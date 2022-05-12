package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "assistens")

public class Assisten {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idassistens")
    private int id;
    @Column(name = "abstens")
    private String abstens;
    @Column(name = "delay")
    private String delay;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "courses", referencedColumnName = "id")
    private int courses_idcourses;
}
