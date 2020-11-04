//13.13(使得course类可复制)。
package 第三次作业;

public class Q4{
	public static void main(String[] args) {
		Course course1 = new Course("abc");
		course1.addStudent("student1");
		course1.addStudent("student2");
		
		Course course2 = (Course)course1.clone();
		System.out.println(course1 == course2);
		course2.addStudent("student3");
		course2.addStudent("student4");
		
		System.out.println(course1.getNumberOfStudents());
		System.out.println(course2.getNumberOfStudents());	
	}
}

class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for(int i=0; i<numberOfStudents;i++) {
			if(students[i] == student) {
				for(int j=i; j<numberOfStudents; j++) {
					students[j] = students[j+1];
				}
				break;
			}
		}
		numberOfStudents--;
	}
	
	@Override
	public Object clone() {
		try {
			Course courseClone = (Course)super.clone();
			courseClone.courseName = courseName;
			courseClone.numberOfStudents = numberOfStudents;
			courseClone.students = new String[100];
			System.arraycopy(students, 0, courseClone.students, 0, 100);
			return courseClone;
		}
		catch(CloneNotSupportedException ex) {
			return null;
		}
	}
	
}