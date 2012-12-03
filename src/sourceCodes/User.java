package sourceCodes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User {
	
	String firstName;
	String lastName;
	String middleName;
	String email;
	String address;
	String city;
	String state;
	String zipCode;
	String username;
	String password;
	String secretAnswer1;
	String secretAnswer2;
	String secretAnswer3;
	
	
	public User(String firstName, String middleName, String lastName,
			String address, String city, String state, String zipCode,
			String username, String password, String email, String secretAnswer1, String secretAnswer2, String secretAnswer3) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.username = username;
		this.password = password;
		this.secretAnswer1 = secretAnswer1;
		this.secretAnswer2 = secretAnswer2;
		this.secretAnswer3 = secretAnswer3;
	}
	



	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", email=" + email
				+ ", address=" + address + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", username=" + username
				+ ", password=" + password + ", secretAnswer1=" + secretAnswer1
				+ ", secretAnswer2=" + secretAnswer2 + ", secretAnswer3="
				+ secretAnswer3 + "]";
	}




	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecretAnswer1() {
		return secretAnswer1;
	}
	public void setSecretAnswer1(String secretAnswer1) {
		this.secretAnswer1 = secretAnswer1;
	}
	public String getSecretAnswer2() {
		return secretAnswer2;
	}
	public void setSecretAnswer2(String secretAnswer2) {
		this.secretAnswer2 = secretAnswer2;
	}
	public String getSecretAnswer3() {
		return secretAnswer3;
	}
	public void setSecretAnswer3(String secretAnswer3) {
		this.secretAnswer3 = secretAnswer3;
	}
	
}
