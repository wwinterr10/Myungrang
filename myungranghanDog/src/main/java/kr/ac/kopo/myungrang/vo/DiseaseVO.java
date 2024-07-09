package kr.ac.kopo.myungrang.vo;

import jakarta.persistence.*;

@Entity(name="disease")
public class DiseaseVO {
	@Id @Column(name="disease_code")
	private String diseaseCode;
	@Column(name="disease_name")
	private String diseaseName;
	private int price;
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public DiseaseVO() {
		super();
	}
	@Override
	public String toString() {
		return "DiseaseVO [diseaseCode=" + diseaseCode + ", diseaseName=" + diseaseName + ", price=" + price + "]";
	}
	
	
}
