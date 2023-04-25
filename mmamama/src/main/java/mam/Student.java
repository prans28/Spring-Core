package mam;

public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	String studentNmae; 
	@Override
	public String toString() {
		return "Student [studentNmae=" + studentNmae + ", age=" + age + ", day=" + day + "]";
	}
	public Student(String studentNmae, int age, int day) {
		super();
		this.studentNmae = studentNmae;
		this.age = age;
		this.day = day;
	}
	int age ; 
	int day; 

	
	public String getStudentNmae() {
		return studentNmae;
	}
	public void setStudentNmae(String studentNmae) {
		this.studentNmae = studentNmae;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
