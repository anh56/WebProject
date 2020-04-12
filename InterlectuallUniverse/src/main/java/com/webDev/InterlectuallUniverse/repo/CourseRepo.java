package com.webDev.InterlectuallUniverse.repo;

import com.webDev.InterlectuallUniverse.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, Integer> , CourseRepoCustom{
}
