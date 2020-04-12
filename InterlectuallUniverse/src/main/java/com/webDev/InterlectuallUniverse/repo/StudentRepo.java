package com.webDev.InterlectuallUniverse.repo;


import com.webDev.InterlectuallUniverse.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Integer>, StudentRepoCustom {

    Student findById(int id);

    //List<Student> getAllStudent();




}

