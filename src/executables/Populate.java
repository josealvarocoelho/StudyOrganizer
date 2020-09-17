package executables;

import activities.Exercise;
import activities.Lesson;
import activities.Session;
import people.Student;
import people.Teacher;
import people.Student.Level;

public class Populate {

	static void initExercises() {
		new Exercise(5, 120, "C Scale", "Book", Exercise.Type.FINGERSTYLE);

	}

	static void initSessions() {
		new Lesson(new Teacher("This lessons' teacher"));
	}

	static void initPeople() {
		new Teacher("The teacher");
		new Student("Student #1", Level.INITIATE, 123);
		new Student("Student #2", Level.INTERMEDIATE, 23);
	}


	static void populate(){
		initPeople();
		initExercises();
		initSessions();
	}

}
