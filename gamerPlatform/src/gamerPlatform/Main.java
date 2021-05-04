package gamerPlatform;

import java.util.GregorianCalendar;

import Adapters.MernisServicesAdapters;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
	 
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Zekeriya Ýshak");
		gamer.setLastName("Doðanay");
		gamer.setNationalityId("42379608852");
		gamer.setDateOfBirth(new GregorianCalendar(2002, 03 , 28).getTime());
		
		GamerManager gamerManager= new GamerManager(new MernisServicesAdapters());
		gamerManager.addGamer(gamer);
		gamerManager.removeGamer(gamer);
		gamerManager.updateGamer(gamer);
		
		Campaign campaign = new Campaign(1,"Doðum gününe Özel", 7.8,true);
		Campaign campaign2 = new Campaign(2,"23 Nisan Çocuklara Özel", 8.9,true);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign2);
		campaignManager.removeCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Valorant");
		game.setPrice(0);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Phasmophobia");
		game2.setPrice(19.85);
		
		
		GameManager gameManager = new GameManager();
		gameManager.sellGame(gamer, game);
		
		GameManager gameManager2 = new GameManager();
		gameManager2.sellGame(gamer, game2, campaign2);
		
	}

}
