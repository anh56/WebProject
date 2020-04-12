package com.webDev.InterlectuallUniverse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Column(unique = true)
    private String studentId;


    @Getter
    private String userName;


    @Getter
    private String password;

    @Getter
    @Setter
    private String email;

    public Student(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
    }
    public Student(){}
}
