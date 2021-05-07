package eCommerceSimulation;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.core.concretes.EmailValidatorManager;
import eCommerceSimulation.core.concretes.InputValidation;
import eCommerceSimulation.core.concretes.JGoogleValidServiceAdapter;
import eCommerceSimulation.dataAccess.concretes.DataBaseUserDao;
import eCommerceSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 User user1 = new User();
		 user1.setFirstName("Ýshak");
		 user1.setLastName("Doðanay");
		 user1.setEmail("abcd@gmail.com");
		 user1.setPassword("1234865");
		 
		 User user2 = new User();
		 user2.setFirstName("Hatice");
		 user2.setLastName("Özkan");
		 user2.setEmail("sdfs@gmail.com");
		 user2.setPassword("9876555");
		 User user3 = new User("Adem","Karaman","gftge@gmail.com","123456789");
		 
		 UserService userService = new UserManager(new JGoogleValidServiceAdapter(),  new DataBaseUserDao(),new EmailValidatorManager());
		 userService.register(user1);
		 System.out.println("----------------------------------");
		 userService.register(user2);
		 System.out.println("----------------------------------");
		 userService.register(user3);
		 System.out.println("----------------------------------");
		 
		 UserService userService2 = new UserManager(new JGoogleValidServiceAdapter(), new DataBaseUserDao(), new EmailValidatorManager());
		 userService2.register(user3);
		 
		 System.out.println("----------------------------------");
		 
		 userService2.login("abcd@gmail.com", "1234865");
		 System.out.println("----------------------------------");
		 userService2.login("sdfs@gmail.com","9876555");
		 
		 
		 
			

			
	
	
	}
	}
