
public class UserManager {
	public void Add(User user) {
		System.out.println(user.firstName + " " + user.lastname + " isimli kullanýcý eklendi.");
	}
	public void Delete(User user) {
		System.out.println(user.firstName + " " + user.lastname + "isimli kullanýcý silinmiþtir.");
	}
	public void Update(User user) {
		System.out.println(user.firstName + " " + user.lastname + "isimli kullanýcý güncellenmiþtir");
	}
}
