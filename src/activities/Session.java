package activities;

import java.util.ArrayList;
import java.util.Date;

public class Session {
	ArrayList<Exercise> ExerciseList = new ArrayList<Exercise>();
	int duration;
	Date date = new Date();

	void addExercise(Exercise exercise) {
		ExerciseList.add(exercise);
		this.duration = this.duration + exercise.duration;
	}
	
	void removeExercise(Exercise exercise) {
		this.duration = this.duration - exercise.getDuration();
		ExerciseList.remove(exercise);
	}
	
}
