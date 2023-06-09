	package Demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name ; 
	private List<String> phone; 
	private Set<String> adress; 
	private Map<String, String> course;
	
	
	public Student(String name, List<String> phone, Set<String> adress, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAdress() {
		return adress;
	}
	public void setAdress(Set<String> adress) {
		this.adress = adress;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", adress=" + adress + ", course=" + course + "]";
	}
	

}
