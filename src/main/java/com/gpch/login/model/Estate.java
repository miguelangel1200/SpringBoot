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
@Table(name = "estate")

public class Estate {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idestate")
    private int id;
    @Column(name = "name_estate")
    private String name_estate;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "notes", referencedColumnName = "id")
    private int notes_idnotes;
}
