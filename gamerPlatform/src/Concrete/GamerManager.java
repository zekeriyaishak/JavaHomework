package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService= gamerCheckService;
	}
	
	
	@Override
	public void addGamer(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + 
					"  kullanýcýnýn kayýtý baþarýlý olmuþtur.Aramýza hoþgeldin " + gamer.getFirstName().toUpperCase()+ " gamer!");
		}else {
			System.out.println(gamer.getFirstName() + gamer.getLastName() +
					"kullanýcýnýn kayýtý baþarýsýz olmuþtur :(");
		}
		
	}

	@Override
	public void removeGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlý kullanýcý sistemimizden silimiþtir.");
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlý oyuncunun bilgileri güncellenmiþtir.");
	}

}
