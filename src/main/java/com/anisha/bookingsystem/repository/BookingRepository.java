package com.anisha.bookingsystem.repository;

import com.anisha.bookingsystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}