package com.pluralsight.model;

public class GoalReport {
	
	private int goalminuets;
	private int exercisemunutes;
	private String exerciseActivity;
	
	
	public GoalReport(int goalminuets,int exercisemunutes, String exerciseActivity)
	{
		this.goalminuets = goalminuets;
		this.exercisemunutes = exercisemunutes;
		this.exerciseActivity = exerciseActivity;
	}
	
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public int getExercisemunutes() {
		return exercisemunutes;
	}
	public int getGoalminuets() {
		return goalminuets;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	public void setExercisemunutes(int exercisemunutes) {
		this.exercisemunutes = exercisemunutes;
	}
	public void setGoalminuets(int goalminuets) {
		this.goalminuets = goalminuets;
	}
}
