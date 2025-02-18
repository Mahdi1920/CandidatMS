package tn.esprit.candidat_ms.services;

import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.dto.QuizDTO;
import tn.starter.mysqlShared.services.IGenericService;

public interface ICandidatService extends IGenericService<CandidatDTO> {
	QuizDTO getQuizById(String id);
}
