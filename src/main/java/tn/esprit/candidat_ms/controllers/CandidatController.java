package tn.esprit.candidat_ms.controllers;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.services.ICandidatService;

import java.util.List;
import java.util.Optional;

@RestController
@NoArgsConstructor
@RequestMapping("/api/Candidat")
public class CandidatController {
	ICandidatService candidatService;
	@PostMapping("/addCandidat")
	public Candidat addCandidat(@RequestBody Candidat candidat) {
		return candidatService.addCandidat(candidat);
	}
	@PutMapping("/putCandidat")
	public Candidat updateCandidat(@RequestBody Candidat candidat) {
		return candidatService.updateCandidat(candidat);
	}
	@GetMapping("/getCandidatById/{idCandidat}")
	public Optional<Candidat> retrieveCandidat(@PathVariable String idCandidat) {
		return candidatService.retrieveCandidat(idCandidat);
	}
	@GetMapping("/GetCandidats")
	public List<Candidat> retrieveAllCandidats() {
		return candidatService.retrieveAllCandidats();
	}
	@DeleteMapping("/deleteCandidat/{idCandidat}")
	public void removeCandidat(@PathVariable String idCandidat) {
		candidatService.removeCandidat(idCandidat);
	}
}
