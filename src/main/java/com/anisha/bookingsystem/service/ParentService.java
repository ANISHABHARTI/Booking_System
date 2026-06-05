package com.anisha.bookingsystem.service;

import com.anisha.bookingsystem.entity.Parent;
import com.anisha.bookingsystem.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    @Autowired
    private ParentRepository parentRepository;

    public Parent save(Parent parent) {
        return parentRepository.save(parent);
    }

    public List<Parent> getAll() {
        return parentRepository.findAll();
    }
}