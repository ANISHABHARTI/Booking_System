package com.anisha.bookingsystem.repository;

import com.anisha.bookingsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}