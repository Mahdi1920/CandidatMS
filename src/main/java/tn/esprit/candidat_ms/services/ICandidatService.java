package tn.esprit.candidat_ms.services;

import tn.esprit.candidat_ms.entities.Candidat;

import java.util.List;
import java.util.Optional;

public interface ICandidatService {
	public Candidat addCandidat(Candidat candidat);
	public Candidat updateCandidat(Candidat candidat);
	public Optional<Candidat> retrieveCandidat(String idCandidat);
	public List<Candidat> retrieveAllCandidats();
	void removeCandidat (String idCandidat);
}
