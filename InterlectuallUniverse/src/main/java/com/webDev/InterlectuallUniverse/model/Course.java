package com.webDev.InterlectuallUniverse.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Course {

    @Id
    @Getter
    private int id;

    @Getter
    @Setter
    private String  name;
}
