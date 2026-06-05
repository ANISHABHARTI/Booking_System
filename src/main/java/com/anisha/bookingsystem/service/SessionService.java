package com.anisha.bookingsystem.service;

import com.anisha.bookingsystem.dto.SessionDTO;
import com.anisha.bookingsystem.entity.Session;
import com.anisha.bookingsystem.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public SessionDTO createSession(SessionDTO sessionDTO) {
        Session session = new Session();
        session.setName(sessionDTO.getName());
        session.setTitle(sessionDTO.getTitle());
        session.setLocation(sessionDTO.getLocation());
        session.setOffering(sessionDTO.getOffering());
        session.setStartTime(sessionDTO.getStartTime());
        session.setEndTime(sessionDTO.getEndTime());

        Session savedSession = sessionRepository.save(session);
        return convertToDTO(savedSession);
    }

    public SessionDTO getSessionById(Long id) {
        Optional<Session> session = sessionRepository.findById(id);
        return session.map(this::convertToDTO).orElse(null);
    }

    public List<SessionDTO> getAllSessions() {
        return sessionRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public SessionDTO updateSession(Long id, SessionDTO sessionDTO) {
        Optional<Session> sessionOptional = sessionRepository.findById(id);
        if (sessionOptional.isPresent()) {
            Session session = sessionOptional.get();
            session.setName(sessionDTO.getName());
            session.setTitle(sessionDTO.getTitle());
            session.setLocation(sessionDTO.getLocation());
            session.setOffering(sessionDTO.getOffering());
            session.setStartTime(sessionDTO.getStartTime());
            session.setEndTime(sessionDTO.getEndTime());

            Session updatedSession = sessionRepository.save(session);
            return convertToDTO(updatedSession);
        }
        return null;
    }

    public boolean deleteSession(Long id) {
        if (sessionRepository.existsById(id)) {
            sessionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private SessionDTO convertToDTO(Session session) {
        return new SessionDTO(
                session.getId(),
                session.getName(),
                session.getTitle(),
                session.getLocation(),
                session.getOffering(),
                session.getStartTime(),
                session.getEndTime()
        );
    }
}