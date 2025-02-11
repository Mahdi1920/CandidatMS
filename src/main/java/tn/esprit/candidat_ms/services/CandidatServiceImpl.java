package tn.esprit.candidat_ms.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.repositories.CandidatRepository;

import java.util.List;
import java.util.Optional;
@NoArgsConstructor
@Service
public class CandidatServiceImpl implements ICandidatService{
	CandidatRepository candidatRepository;
	@Override
	public Candidat addCandidat(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public Candidat updateCandidat(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public Optional<Candidat> retrieveCandidat(String idCandidat) {
		return candidatRepository.findById(idCandidat);
	}

	@Override
	public List<Candidat> retrieveAllCandidats() {
		return candidatRepository.findAll();
	}

	@Override
	public void removeCandidat(String idCandidat) {
		candidatRepository.deleteById(idCandidat);
	}
}
