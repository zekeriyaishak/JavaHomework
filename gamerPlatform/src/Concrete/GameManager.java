package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{

	
	@Override
	public void sellGame(Gamer gamer, Game game,Campaign campaign) {
			System.out.println(gamer.getFirstName() + " isimli gamer" +" " + game.getGameName() + " isimli oyunun fiyatý"+  " " 
					+ game.getPrice() + " Tl iken " + campaign.getCampaignName() + " kampanyasý ile %" +
					campaign.getDisCount() + " indirim tutarý ile" + game.getPriceAfterDiscount(campaign) + "TL'ye oyun satýn alýnmýþtýr.Baþarýlar...");
			
		
	}

	@Override
	public void sellGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " isimli gamer" +" " + game.getGameName() + " oyunu"+ " " 
				+ game.getPrice() +  " Tl' ye satýn alýnmýþtýr.iyi oyunlar");

		
	}

}
