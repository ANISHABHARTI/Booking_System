package com.anisha.bookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.anisha.bookingsystem.entity.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
