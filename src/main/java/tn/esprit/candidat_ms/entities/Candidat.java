package tn.esprit.candidat_ms.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.starter.shared.entities.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Candidat extends BaseEntity  {
	String nom;
	String prenom;
	Integer nbQuiz;

	public Candidat(String nom, String prenom, Integer nbQuiz) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nbQuiz = nbQuiz;
	}

	public Candidat() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getNbQuiz() {
		return nbQuiz;
	}

	public void setNbQuiz(Integer nbQuiz) {
		this.nbQuiz = nbQuiz;
	}
}
