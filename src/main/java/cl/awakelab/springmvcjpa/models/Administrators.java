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
@Table(name = "administrators")
public class Administrators extends User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;

	private String area;
	private String previousExperience;

	public Administrators() {
		super();
	}

	public Administrators(int id, User user, String area, String previousExperience) {
		super();
		this.id = id;
		this.user = user;
		this.area = area;
		this.previousExperience = previousExperience;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPreviousExperience() {
		return previousExperience;
	}

	public void setPreviousExperience(String previousExperience) {
		this.previousExperience = previousExperience;
	}

	@Override
	public String toString() {
		return "Administrative [id=" + id + ", user=" + user + ", area=" + area + ", previousExperience="
				+ previousExperience + "]";
	}

}
