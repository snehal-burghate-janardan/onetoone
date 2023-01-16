package one_to_one_uni_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private long phone;
	private String address;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", adharcard="
				+ adharcard + ", getAdharcard()=" + getAdharcard() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPhone()=" + getPhone() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@OneToOne
	private AdharCard adharcard;
	
	public AdharCard getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(AdharCard adharcard) {
		this.adharcard = adharcard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
