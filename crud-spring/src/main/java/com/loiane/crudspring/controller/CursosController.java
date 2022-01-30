package com.loiane.crudspring.controller;

import com.loiane.crudspring.model.Course;
import com.loiane.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CursosController {

    private final CourseRepository courseRepository;

    @GetMapping
    @ResponseBody // retorna em json ou xml
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
