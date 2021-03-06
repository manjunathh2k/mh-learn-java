package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="goals")
public class Goal {
	
	@Id
	@GeneratedValue
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name="min")
	private int minutes;
	
	@OneToMany(mappedBy="goal", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Exercise> exercise  = new ArrayList<Exercise>();

	public List<Exercise> getExercise() {
		return exercise;
	}

	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setExercise(List<Exercise> exercise) {
		this.exercise = exercise;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
