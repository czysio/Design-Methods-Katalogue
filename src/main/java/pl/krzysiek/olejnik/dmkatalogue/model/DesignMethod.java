package pl.krzysiek.olejnik.dmkatalogue.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import pl.krzysiek.olejnik.dmkatalogue.validator.MethodDescription;
import pl.krzysiek.olejnik.dmkatalogue.validator.MethodName;

@Entity
@Table(name = "design_method")
public class DesignMethod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@MethodName
	private String name;
	@MethodDescription
	private String short_description;
	private String assumptions;
	private String rules;
	private String stages;
	private String problems;
	private int difficulty;
	private String number_of_participants;
	private int detail_level;
	private int advancement_level;
	private int freedom_level;
	
	@CreationTimestamp
	@Column(updatable = false)	
	private Timestamp created;
	
	private String icon;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
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

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public String getNumber_of_participants() {
		return number_of_participants;
	}

	public void setNumber_of_participants(String number_of_participants) {
		this.number_of_participants = number_of_participants;
	}

	public int getDetail_level() {
		return detail_level;
	}

	public void setDetail_level(int detail_level) {
		this.detail_level = detail_level;
	}

	public int getAdvancement_level() {
		return advancement_level;
	}

	public void setAdvancement_level(int advancement_level) {
		this.advancement_level = advancement_level;
	}

	public int getFreedom_level() {
		return freedom_level;
	}

	public void setFreedom_level(int freedom_level) {
		this.freedom_level = freedom_level;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}


}
