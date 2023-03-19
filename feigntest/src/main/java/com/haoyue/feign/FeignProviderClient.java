package com.haoyue.feign;

import com.haoyue.entity.Student;
import com.haoyue.feign.impl.FeignProviderClientError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(value = "provider",fallback = FeignProviderClientError.class)
public interface FeignProviderClient {
    @GetMapping(value = "/client/findStudentList")
    List<Student> findStudentList();
    @GetMapping(value = "/client/getPort")
    String getPort();
}
