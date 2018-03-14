package krzysiek.olejnik.katalogue.model;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "learning_method")
public class DesignMethod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String assumptions;
	private String rules;
	private String stages;
	private Blob stages_icon;
	private String problems;
	private Blob problems_icon;
	private String difficulty;
	private String numberOfParticipants;
	private String detailLevel;
	private String advancementLevel;
	private String freedomLevel;
	
	@CreationTimestamp
	@Column(updatable = false)	
	private Timestamp created;
	
	private Blob icon;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAssumptions() {
		return assumptions;
	}

	public void setAssumptions(String assumptions) {
		this.assumptions = assumptions;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getStages() {
		return stages;
	}

	public void setStages(String stages) {
		this.stages = stages;
	}

	public Blob getStages_icon() {
		return stages_icon;
	}

	public void setStages_icon(Blob stages_icon) {
		this.stages_icon = stages_icon;
	}

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public Blob getProblems_icon() {
		return problems_icon;
	}

	public void setProblems_icon(Blob problems_icon) {
		this.problems_icon = problems_icon;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(String numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}

	public String getDetailLevel() {
		return detailLevel;
	}

	public void setDetailLevel(String detailLevel) {
		this.detailLevel = detailLevel;
	}

	public String getAdvancementLevel() {
		return advancementLevel;
	}

	public void setAdvancementLevel(String advancementLevel) {
		this.advancementLevel = advancementLevel;
	}

	public String getFreedomLevel() {
		return freedomLevel;
	}

	public void setFreedomLevel(String freedomLevel) {
		this.freedomLevel = freedomLevel;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Blob getIcon() {
		return icon;
	}

	public void setIcon(Blob icon) {
		this.icon = icon;
	}

}
