package activities;

import java.util.ArrayList;

import people.Student;
import people.Teacher;

public class Lesson extends Session {


	ArrayList<Student> Students = new ArrayList<Student>();
	Teacher teacher;

	public Lesson(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public void addStudent(Student student) {
		Students.add(student);
	}

}
