package people;

public class Student {
	public enum Level {INITIATE, INTERMEDIATE, ADVANCED};
	
	int studentID;
	String name;
	Level level;
	
		
	public Student(String name, Level level, int studentID) {
		this.studentID = studentID;
		this.name = name;
		this.level = level;
	}
	
	
	
}
