package tn.esprit.candidat_ms.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.repositories.CandidatRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidatServiceImpl implements ICandidatService{
	private CandidatRepository candidatRepository;

	@Override
	public Candidat add(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public Candidat update(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public Candidat retrieveById(Long idCandidat) {
		return candidatRepository.findById(idCandidat).orElse(null);
	}

	@Override
	public List<Candidat> retrieveAll() {
		return candidatRepository.findAll();
	}

	@Override
	public void delete(Long idCandidat) {
		candidatRepository.deleteById(idCandidat);
	}
}
