package cl.awakelab.springmvcjpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client extends User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;

	private String phoneNumber;
	private String afp;
	private String healthSystem;
	private String address;
	private String commune;

	public Client() {
		super();
	}

	public Client(int id, User user, String phoneNumber, String afp, String healthSystem, String address,
			String commune) {
		super();
		this.id = id;
		this.user = user;
		this.phoneNumber = phoneNumber;
		this.afp = afp;
		this.healthSystem = healthSystem;
		this.address = address;
		this.commune = commune;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

	@Override
	public String toString() {
		return "Client [id=" + id + ", user=" + user + ", phoneNumber=" + phoneNumber + ", afp=" + afp
				+ ", healthSystem=" + healthSystem + ", address=" + address + ", commune=" + commune + "]";
	}

}
