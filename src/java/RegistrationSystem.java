
package java;
import java.util.Random;

public class RegistrationSystem {
	private Student[] students;
	private Course[] courses;
	private static int studentCounter = 0;
	private static int courseCounter = 0;

        public RegistrationSystem() {
            students = new Student[10];
            courses = new Course[10];
        }
	public Student createStudent(String firstName, String lastName) {
            Random r = new Random();
            int id;
            do
            {
                id = r.nextInt(100);
            }while (idExists(id));
            
            Student s = new Student(firstName, lastName, id);
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = s;
                    return s;
                }
            }
            System.out.println("No more courses allowed.");
            return null;
	}
	public Course createCourse(String title, int sectionNumber) {
            if (courseNumExists(sectionNumber)) {
                System.out.println("That section number already exists.");
                return null;
            }
            
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
	public boolean registerStudent(int studentId, int sectionNumber) {
            Course c = getCourse(sectionNumber);
            Student s = getStudent(studentId);
            if (c == null || s == null) {
                return false;
            }
            c.addStudent(s);
            s.addCourse(c);
            return true;
	}
	public Course[] displaySchedule(int studentId) {
            return getStudent(studentId).getCourses();
	}
	public Student[] getRoster(int sectionNumber) {
            return getCourse(sectionNumber).getStudents();
	}
        private Student getStudent(int id) {
            for (Student s : students) {
                if (s != null && s.getStudentId() == id) {
                    return s;
                }
            }
            return null; //Doesnt exist
        }
        private boolean idExists(int id) {
            for (Student s : students) {
                if (s != null && s.getStudentId() == id) {
                    return true; //ID exists. Try again
                }
            }
            return false; //Doesnt exist
        }
        private Course getCourse(int courseNum) {
            for (Course c : courses) {
                if (c != null && c.getSectionNumber() == courseNum) {
                    return c;
                }
            }
            return null; //Doesnt exist
        }
        private boolean courseNumExists(int courseNum) {
            for (Course c : courses) {
                if (c != null && c.getSectionNumber() == courseNum) {
                    return true; //ID exists. Try again
                }
            }
            return false; //Doesnt exist
        }
}

