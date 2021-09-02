package JPA.DEMO;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	
	@Id
	private int l_id;
	private String l_name;
	
	@ManyToMany
	private List<Student> student;

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	

	
	@Override
	public String toString() {
		return "Laptop [l_id=" + l_id + ", l_name=" + l_name + "]";
}
	
	
	
	

}
