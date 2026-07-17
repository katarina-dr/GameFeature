package com.games.gamefeature.service;

import com.games.gamefeature.entity.Audit;
import com.games.gamefeature.repository.AuditRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditService {

    private final AuditRepository auditRepository;

    public AuditService(AuditRepository auditRepository) {

        this.auditRepository = auditRepository;
    }

    public List<Audit> getAllAudits() {
        return auditRepository.findAll();
    }

    public Audit getAuditById(Long id) {
        return auditRepository.findById(id).orElse(null);
    }

    public Audit createAudit(Audit audit) {

        audit.setTimestamp(LocalDateTime.now());

        return auditRepository.save(audit);
    }

    public Audit updateAudit(Long id, Audit updatedAudit) {

        Audit audit = auditRepository.findById(id).orElse(null);

        if (audit == null) {
            return null;
        }

        audit.setAction(updatedAudit.getAction());
        audit.setPerformedBy(updatedAudit.getPerformedBy());
        audit.setGame(updatedAudit.getGame());

        return auditRepository.save(audit);
    }

    public void deleteAudit(Long id) {
        auditRepository.deleteById(id);
    }

}