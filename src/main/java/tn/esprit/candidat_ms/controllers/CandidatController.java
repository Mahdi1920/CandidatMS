package tn.esprit.candidat_ms.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.services.ICandidatService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Candidat")
public class CandidatController {
	private ICandidatService candidatService;

	@PostMapping("/addCandidat")
	public Candidat addCandidat(@RequestBody Candidat candidat) {
		return candidatService.add(candidat);
	}
	@PutMapping("/putCandidat")
	public Candidat updateCandidat(@RequestBody Candidat candidat) {
		return candidatService.update(candidat);
	}
	@GetMapping("/getCandidatById/{idCandidat}")
	public Candidat retrieveCandidat(@PathVariable long idCandidat) {
		return candidatService.retrieveById(idCandidat);
	}
	@GetMapping("/GetCandidats")
	public List<Candidat> retrieveAllCandidats() {
		return  candidatService.retrieveAll();
	}
	@DeleteMapping("/deleteCandidat/{idCandidat}")
	public void removeCandidat(@PathVariable long idCandidat) {
		candidatService.delete(idCandidat);
	}
}
