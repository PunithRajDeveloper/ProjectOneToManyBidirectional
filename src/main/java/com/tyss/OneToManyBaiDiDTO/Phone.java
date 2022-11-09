package com.tyss.OneToManyBaiDiDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {
   @Id 
	private int id;
	private String brand;
	private String company;
	private String ucode;
	private int price;
	
	@OneToMany(mappedBy = "phone")
	private List<Sim> sims;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUcode() {
		return ucode;
	}

	public void setUcode(String ucode) {
		this.ucode = ucode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Sim> getSims() {
		return sims;
	}

	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", company=" + company + ", ucode=" + ucode + ", price=" + price
				+ ", sims=" + sims + "]";
	}
	
	
	
	
}

