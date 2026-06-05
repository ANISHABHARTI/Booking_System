package com.anisha.bookingsystem.repository;

import com.anisha.bookingsystem.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}