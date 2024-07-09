package kr.ac.kopo.myungrang.vo;

import jakarta.persistence.*;

@Entity(name="doctor")
public class DoctorVO {
	@Id @Column(name="doctor_id")
	private String doctorId;
	@Column(name="doctor_name")
	private String doctorName;
	private String department;
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public DoctorVO() {
		super();
	}
	@Override
	public String toString() {
		return "DoctorVO [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department + "]";
	}
	
	

}
