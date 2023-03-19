package com.haoyue.feign.impl;

import com.haoyue.entity.Student;
import com.haoyue.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
@Component
public class FeignProviderClientError implements FeignProviderClient {
    @Override
    public List<Student> findStudentList() {
        return Collections.emptyList();
    }

    @Override
    public String getPort() {
        return "系统维护中";
    }
}
