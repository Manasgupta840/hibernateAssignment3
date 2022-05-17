package pStudent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "STUDENT_DETAILS")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="empId_generator")

	@SequenceGenerator(name="empId_generator",initialValue=130,allocationSize =1, sequenceName = "empid_seq")
	private Integer rollNo;
	private String name;
	private Integer age;
	private String classSection;
	private String address;
	public Student() {

//	 TODO Auto-generated constructor stub
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", classSection=" + classSection
				+ ", address=" + address + "]";
	}
	
	
}
