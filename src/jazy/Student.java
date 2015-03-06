
package jazy;

public class Student {
	private String firstName;
	private String lastName;
	private int studentId;
	private Course[] courses;

	public Student(String firstName, String lastName, int studentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		courses = new Course[10];
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public Course[] getCourses() {
		return courses;
	}
	public int getStudentId() {
		return studentId;
	}
	public void addCourse(Course course) {
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] == null) {
				courses[i] = course;
				return;
			}
		}
		System.out.println("No more courses allowed");
	}
}

