package spring;

import jakarta.persistence.*;


@Entity
@Table(name="login")
@SecondaryTable(name="details", pkJoinColumns=@PrimaryKeyJoinColumn(name="id"))
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="fname", table="details")
	String fname;
	
	@Column(name="lname", table="details")
	String lname;
	
	@Column(name="address", table="details")
	String address;
	
	@Column(name="city", table="details")
	String city;
	
	@Column(name="state", table="details")
	String state;
	
	@Column(name="zipcode", table="details")
	String zipcode;
	
	@Column(name="phone", table="details")
	String phone;
	
	@Column(name="email")
	String email;
	
	@Column(name="password", table="login")
	String password;
	
	
	public User() {
		super();
	}
	
	public User(String fname, String lname, String address, String city, String state, String zipcode, String phone,
			String email, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
