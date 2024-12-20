package mappingrealtion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class student {
	@Id
	private int  rollno;
	private String name;
	private int marks;
	//linking between student and laptop
	//relationship between laptop and studenet
	@OneToOne
	private laptop laptop;
	
	
	
	public laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
