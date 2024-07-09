package kr.ac.kopo.myungrang.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity(name="health")
@SequenceGenerator( 
		 name = "SEQ_HEALTH_GENERATOR", 
		 sequenceName = "SEQ_HEALTH_NO", //매핑할 데이터베이스 시퀀스 이름
		 initialValue = 1, allocationSize = 1)
public class HealthVO {
	@Id @Column(name="health_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
			generator = "SEQ_HEALTH_GENERATOR")
	private int healthNo;
	@Column(name="dog_no")
	private int dogNo;
	@Column(name="member_id")
	private String memberId;
	@Column(name="visit_date")
	private String visitDate;
	@Column(name="disease_code")
	private String diseaseCode;
	private String significant;
	public int getHealthNo() {
		return healthNo;
	}
	public void setHealthNo(int healthNo) {
		this.healthNo = healthNo;
	}
	public int getDogNo() {
		return dogNo;
	}
	public void setDogNo(int dogNo) {
		this.dogNo = dogNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getSignificant() {
		return significant;
	}
	public void setSignificant(String significant) {
		this.significant = significant;
	}
	@Override
	public String toString() {
		return "HealthVO [healthNo=" + healthNo + ", dogNo=" + dogNo + ", memberId=" + memberId + ", visitDate="
				+ visitDate + ", diseaseCode=" + diseaseCode + ", significant=" + significant + "]";
	}
	public HealthVO() {
		super();
	}
	
}
