package com.anisha.bookingsystem.repository;

import com.anisha.bookingsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}