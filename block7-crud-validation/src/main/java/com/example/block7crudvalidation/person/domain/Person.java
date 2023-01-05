package com.example.block7crudvalidation.person.domain;

import com.example.block7crudvalidation.profesor.domain.Profesor;
import com.example.block7crudvalidation.student.domain.Student;
import lombok.*;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person", nullable = false)
    private int id_person;

    @OneToOne
    Profesor profesor;

    @OneToOne
    Student student;

    @Column(name = "user_name", nullable = false, length = 10)
    private String usuario;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "person_name", nullable = false)
    private String name;

    @Column(name = "person_surname")
    private String surname;

    @Column(name = "personal_email", nullable = false)
    private String company_email;

    @Column(name = "company_email", nullable = false)
    private String personal_email;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_at")
    private Date created_date = new Date();

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "image_url")
    private URL image_url;

    @Column(name= "LastDate")
    private  Date termination_date = new Date();

}

