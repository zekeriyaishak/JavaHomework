
public class UserManager {
	public void Add(User user) {
		System.out.println(user.firstName + " " + user.lastname + " isimli kullanıcı eklendi.");
	}
	public void Delete(User user) {
		System.out.println(user.firstName + " " + user.lastname + "isimli kullanıcı silinmiştir.");
	}
	public void Update(User user) {
		System.out.println(user.firstName + " " + user.lastname + "isimli kullanıcı güncellenmiştir");
	}
}
