package Hibernate.basic ;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private Names name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Names getName() {
		return name;
	}
	public void setName(Names name) {
		this.name = name;
	}
	
	
}
