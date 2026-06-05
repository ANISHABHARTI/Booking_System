package com.anisha.bookingsystem.controller;

import com.anisha.bookingsystem.entity.Offering;
import com.anisha.bookingsystem.service.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/offerings")
public class OfferingController {

    @Autowired
    private OfferingService offeringService;

    @PostMapping
    public ResponseEntity<Offering> createOffering(@RequestBody Offering offering) {
        Offering createdOffering = offeringService.createOffering(offering);
        return new ResponseEntity<>(createdOffering, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Offering> getOfferingById(@PathVariable Long id) {
        Optional<Offering> offering = offeringService.getOfferingById(id);
        return offering.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Offering>> getAllOfferings() {
        List<Offering> offerings = offeringService.getAllOfferings();
        return new ResponseEntity<>(offerings, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Offering> updateOffering(@PathVariable Long id, @RequestBody Offering offeringDetails) {
        Offering updatedOffering = offeringService.updateOffering(id, offeringDetails);
        if (updatedOffering != null) {
            return new ResponseEntity<>(updatedOffering, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOffering(@PathVariable Long id) {
        offeringService.deleteOffering(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}