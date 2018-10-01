package handy;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID =1L;
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	private String accountType;
	private String token;
	
	public User() {}
	
	public User(int id,String firstName, String lastName, String eMail, String password, String accountType, String token) {
		this.id = id;
		this.firstName= firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.accountType = accountType;
		this.token = token;
		
	}
	
	
	public int getID() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return eMail;
	}
	public  String getPassword() {
		return password;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getToken() {
		return token;
	}
	
	public void setID(int id) {
		this.id =id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	

}
