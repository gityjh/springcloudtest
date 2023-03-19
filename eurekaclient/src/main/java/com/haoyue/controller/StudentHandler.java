package com.haoyue.controller;

import com.haoyue.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class StudentHandler {
    @Value("${server.port}")
    private String port;
    @GetMapping("/findStudentList")
    public List<Student> findStudentList(){
        Student student1 = new Student("张三",1);
        Student student2 = new Student("李四",2);
        Student student3 = new Student("王五",3);
        List<Student> list = new ArrayList<>(5);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }
    @GetMapping("/getPort")
    public String getPort(){
        return this.port;
    }
}
