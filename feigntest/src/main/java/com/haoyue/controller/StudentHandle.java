package com.haoyue.controller;

import com.haoyue.entity.Student;
import com.haoyue.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class StudentHandle {
    @Autowired
    FeignProviderClient feignProviderClient;
    @GetMapping("/findStudentList")
    public List<Student> findStudentList(){
        return feignProviderClient.findStudentList();
    }
    @GetMapping("/getPort")
    public String getPort(){
        return feignProviderClient.getPort();
    }
}
