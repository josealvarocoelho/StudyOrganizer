package executables;

import activities.Exercise;



public class Main {

	public static void main(String[] args) {
		Exercise exercise1 = new Exercise(5, 120, "C Scale", "Book", Exercise.Type.FINGERSTYLE);
		System.out.println(exercise1.getDuration());
		System.out.println(exercise1.getBpm());
		System.out.println(exercise1.getName());
		System.out.println(exercise1.getSource());
		System.out.println(exercise1.type);
	}

}
