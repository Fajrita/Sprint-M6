package cl.awakelab.springmvcjpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client extends User {

	@Column(name = "phone_number")
	private String phoneNumber;
	private String afp;
	@Column(name = "health_system")
	private String healthSystem;
	private String address;
	private String commune;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getHealthSystem() {
		return healthSystem;
	}

	public void setHealthSystem(String healthSystem) {
		this.healthSystem = healthSystem;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

}
