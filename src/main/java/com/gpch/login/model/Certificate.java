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
@Table(name = "certificates")
public class Certificate {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcertificates")
    private int id;
    @Column(name = "name_certificate")
    private String name_certificate;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "courses", referencedColumnName = "id")
    private int courses_idcourses;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "users", referencedColumnName = "id")
    private int users_user_id;
}
