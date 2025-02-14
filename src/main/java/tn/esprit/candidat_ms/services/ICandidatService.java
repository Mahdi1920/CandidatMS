package tn.esprit.candidat_ms.services;

import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.shared.dto.CandidatDTO;
import tn.starter.shared.services.IGenericService;

//import tn.starter.mysqlShared.services.IGenericService;
public interface ICandidatService extends IGenericService<CandidatDTO,Candidat,Long> {
}
