package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.core.abstracts.InputValidService;
import eCommerceSimulation.core.abstracts.ValidatorService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {
	
	InputValidService userInformationValidation;
	UserDao userdao;
	ValidatorService validatorService;
	
	public UserManager(InputValidService userInformationValidation, UserDao userdao,
			ValidatorService validatorService) {
		this.userInformationValidation = userInformationValidation;
		this.userdao = userdao;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if(!userInformationValidation.isValid(user)) {
			System.out.println("Kullanýcý bilgileri yanlýþ girilmiþtir!.Kayýt edilememiþtir!!!");
		}
		else if (!userdao.emailCheck(user)){
			System.out.println("Bu email'i daha önce baþkasý tarafýndan alýnmýþ " + user.getEmail() + "\n" + "Kayýt iþlemi baþarýsýz olmuþtur!");
		}
		else {
			userdao.add(user);
			validatorService.sendVerificationMail();
		}
	}

	@Override
	public void login(String email, String password) {
		if(userdao.loginByCheck(email, password)) {
			System.out.println("Sisteme giriþ baþarýlý :)");
		}
		else {
			System.out.println("Sisteme giriþ baþarýsýz!");
		}
	}

}
