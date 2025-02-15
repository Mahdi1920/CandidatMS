package tn.esprit.candidat_ms.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.services.IGenericServiceImpl;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidatServiceImpl extends IGenericServiceImpl<CandidatDTO,Candidat> implements ICandidatService{
}
