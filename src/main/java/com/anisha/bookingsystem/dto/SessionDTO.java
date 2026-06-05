package com.anisha.bookingsystem.dto;

import java.time.LocalDateTime;

public class SessionDTO {

    private Long id;
    private String name;
    private String title;
    private String location;
    private String offering;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public SessionDTO() {
    }

    public SessionDTO(Long id, String name, String title, String location, String offering, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.location = location;
        this.offering = offering;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOffering() {
        return offering;
    }

    public void setOffering(String offering) {
        this.offering = offering;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}