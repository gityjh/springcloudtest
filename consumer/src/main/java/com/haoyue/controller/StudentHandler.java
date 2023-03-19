package com.haoyue.controller;

import com.haoyue.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class StudentHandler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findStudentList")
    public List<Student> findStudentList(){
       return restTemplate.getForEntity("http://localhost:8010/student/findStudentList",List.class).getBody();
    }
}
