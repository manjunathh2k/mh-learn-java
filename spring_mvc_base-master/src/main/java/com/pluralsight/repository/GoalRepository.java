package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> getAllGoals();

	List<GoalReport> getGoalReports();
}
