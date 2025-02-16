package tn.esprit.candidat_ms.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.mysqlShared.controllers.GenericController;
import tn.starter.mysqlShared.dto.CandidatDTO;


@RestController
@AllArgsConstructor
@RequestMapping("/api/candidat")
public class CandidatController extends GenericController<CandidatDTO> {
}
