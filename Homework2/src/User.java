
public class User {
	int id;
	String firstName;
	String lastname;
	String password;
	public User() {
		
	}
	public User(int id, String firstName, String lastname, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
