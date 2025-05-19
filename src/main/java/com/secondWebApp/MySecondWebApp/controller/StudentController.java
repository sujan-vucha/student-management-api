package com.secondWebApp.MySecondWebApp.controller;

import com.secondWebApp.MySecondWebApp.model.Students;
import com.secondWebApp.MySecondWebApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/students")
    public List<Students> show(){
        return service.show();
    }
    @GetMapping("/students/{reg}")
    public Students showbyReg(@PathVariable int reg){
        return service.showbyReg(reg);
    }
    @PostMapping("/students")
    public void admission(@RequestBody Students s){
        service.admission(s);
    }
    @PutMapping("/students")
    public void updation(@RequestBody Students s){
        service.updation(s);
    }
    @DeleteMapping("/students/{id}")
    public void deletion(@PathVariable int id){
        service.deletion(id);
    }



}
