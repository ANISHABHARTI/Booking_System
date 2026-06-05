package com.anisha.bookingsystem.service;

import com.anisha.bookingsystem.entity.Offering;
import com.anisha.bookingsystem.repository.OfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OfferingService {

    @Autowired
    private OfferingRepository offeringRepository;

    public Offering createOffering(Offering offering) {
        return offeringRepository.save(offering);
    }

    public Optional<Offering> getOfferingById(Long id) {
        return offeringRepository.findById(id);
    }

    public List<Offering> getAllOfferings() {
        return offeringRepository.findAll();
    }

    public Offering updateOffering(Long id, Offering offeringDetails) {
        Optional<Offering> offering = offeringRepository.findById(id);
        if (offering.isPresent()) {
            Offering existingOffering = offering.get();
            existingOffering.setName(offeringDetails.getName());
            existingOffering.setTeacher(offeringDetails.getTeacher());
            existingOffering.setCourse(offeringDetails.getCourse());
            return offeringRepository.save(existingOffering);
        }
        return null;
    }

    public void deleteOffering(Long id) {
        offeringRepository.deleteById(id);
    }
}