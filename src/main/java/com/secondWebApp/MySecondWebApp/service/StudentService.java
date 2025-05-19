package com.secondWebApp.MySecondWebApp.service;

import com.secondWebApp.MySecondWebApp.model.Students;
import com.secondWebApp.MySecondWebApp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public List<Students> show() {
        return repo.findAll();
    }

    public Students showbyReg(int reg) {
        return repo.findById(reg).orElse(new Students());
    }

    public void admission(Students s) {
        repo.save(s);
    }

    public void updation(Students s) {
        repo.save(s);
    }

    public void deletion(int id) {
        repo.deleteById(id);
    }
}
