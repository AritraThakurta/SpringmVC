package test.mvc;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {

	//@NotEmpty(message="please provide userName")
	@Size(min=2,max=30)
	@IsValidName(listofValidNames = "Aritra|Sam|Trevor")
	private String studentName;

	private String studentRoll;

	private Long phoneNumber;

	private Date studentDOB;

	private List<String> studentSkills;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public List<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	

}
