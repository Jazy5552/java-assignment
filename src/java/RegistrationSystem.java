
package java;

public class RegistrationSystem {
	Student[] students;
	Course[] courses;
	static int studentCounter = 0;
	static int courseCounter = 0;

	public Student createStudent(String firstName, String lastName) {
		//TODO
	}
	public Course createCourse(String title, int sectionNumber) {
		Course c = new Course(title, sectionNumber);
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] == null) {
				courses[i] = c;
				return c;
			}
		}
		System.out.println("No more courses allowed.");
		return null;
	}
	public boolean registerStudent(String studentId, int sectionNumber) {
		//TODO
	}
	public Course[] displaySchedule(String studentId) {
		//TODO
	}
	public Student[] getRoster(int sectionNumber) {
		//TODO
	}
}

