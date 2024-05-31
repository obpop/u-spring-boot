package com.ll.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //TODO check difference between Controller and RestController
public class GradeController {

    @GetMapping("/hello")
    public String gradeForm() {
        return "Grade";
    }
}
