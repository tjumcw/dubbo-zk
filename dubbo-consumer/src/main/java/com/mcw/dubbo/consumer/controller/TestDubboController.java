package com.mcw.dubbo.consumer.controller;

import com.mcw.dubbo.export.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dubbo")
public class TestDubboController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public String getTestResult() {
        return testService.TestDubbo();
    }
}
