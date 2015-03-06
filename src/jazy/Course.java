
package jazy;

public class Course {
	private String title;
	private int sectionNum;
	private Student[] students;

	public Course(String title, int sectionNum) {
		this.title = title;
		this.sectionNum = sectionNum;
		students = new Student[10];
	}
	public String getTitle() {
		return title;
	}
	public int getSectionNumber() {
		return sectionNum;
	}
	public Student[] getStudents() {
		return students;
	}
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return;
			}
		}
		System.out.println("No more students allowed.");
	}
}

