package tn.esprit.candidat_ms.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.candidat_ms.entities.Candidat;
import tn.esprit.candidat_ms.feignClients.QuizClient;
import tn.starter.mysqlShared.dto.CandidatDTO;
import tn.starter.mysqlShared.dto.QuizDTO;
import tn.starter.mysqlShared.services.IGenericServiceImpl;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidatServiceImpl extends IGenericServiceImpl<CandidatDTO,Candidat> implements ICandidatService{
	private final QuizClient quizClient;
	@Override
	public QuizDTO getQuizById(String id) {
		return quizClient.getQuizById(id);
	}
}
