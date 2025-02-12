package tn.esprit.candidat_ms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.candidat_ms.entities.Candidat;
public interface CandidatRepository extends JpaRepository<Candidat,Long> {
}
