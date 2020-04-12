package com.webDev.InterlectuallUniverse.controller;


import com.webDev.InterlectuallUniverse.model.Student;
import com.webDev.InterlectuallUniverse.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewStudent(@RequestParam String name, @RequestParam String email, @RequestParam String studentId){
        Student student = new Student(name, studentId, email);
        studentRepo.save(student);
        return "saved";
    }



//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<Student> getAllStudent(){
//        return studentRepo.findAll();
//    }


}
