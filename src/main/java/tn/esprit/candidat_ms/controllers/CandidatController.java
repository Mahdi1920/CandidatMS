package tn.esprit.candidat_ms.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.shared.controllers.GenericController;
import tn.starter.shared.dto.CandidatDTO;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Candidat")
public class CandidatController extends GenericController<CandidatDTO,Candidat,Long> {
}
