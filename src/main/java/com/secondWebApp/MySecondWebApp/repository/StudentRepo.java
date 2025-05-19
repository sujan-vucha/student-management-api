package com.secondWebApp.MySecondWebApp.repository;

import com.secondWebApp.MySecondWebApp.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer> {
}
