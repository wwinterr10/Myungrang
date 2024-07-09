package kr.ac.kopo.myungrang.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity(name="reservation")
@SequenceGenerator( 
		 name = "SEQ_RESERVATION_GENERATOR", 
		 sequenceName = "SEQ_RESERVATION_NO", //매핑할 데이터베이스 시퀀스 이름
		 initialValue = 1, allocationSize = 1)
public class ReservationVO {
	@Id @Column(name="reservation_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
			generator = "SEQ_RESERVATION_GENERATOR")
	private int reservationNo;
	@Column(name="dog_no")
	private int dogNo;
	@Column(name="member_id")
	private String memberId;
	@Column(name="doctor_id")
	private String doctorId;
	@Column(name="reservation_date")
	private String reservationDate;
	@Column(name="reservation_time")
	private String reservationTime;
	public int getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
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
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
	public ReservationVO() {
		super();
	}
	@Override
	public String toString() {
		return "ReservationVO [reservationNo=" + reservationNo + ", dogNo=" + dogNo + ", memberId=" + memberId
				+ ", doctorId=" + doctorId + ", reservationDate=" + reservationDate + ", reservationTime="
				+ reservationTime + "]";
	}
	
	
}