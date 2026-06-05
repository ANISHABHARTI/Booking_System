package com.anisha.bookingsystem.dto;

import java.time.LocalDateTime;

public class BookingDTO {

    private Long id;
    private LocalDateTime bookingDate;
    private String status;
    private StudentDTO student;
    private SessionDTO session;

    public BookingDTO() {
    }

    public BookingDTO(Long id, LocalDateTime bookingDate, String status, StudentDTO student, SessionDTO session) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.status = status;
        this.student = student;
        this.session = session;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public SessionDTO getSession() {
        return session;
    }

    public void setSession(SessionDTO session) {
        this.session = session;
    }
}
