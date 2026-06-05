package com.anisha.bookingsystem.controller;

import com.anisha.bookingsystem.entity.Parent;
import com.anisha.bookingsystem.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parents")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @PostMapping
    public Parent create(@RequestBody Parent parent) {
        return parentService.save(parent);
    }

    @GetMapping
    public List<Parent> getAll() {
        return parentService.getAll();
    }
}