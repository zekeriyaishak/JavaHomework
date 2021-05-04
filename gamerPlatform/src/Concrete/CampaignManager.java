package Concrete;

import Abstract.CampaingService;
import Entities.Campaign;

public class CampaignManager implements CampaingService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya %" + campaign.getDisCount() + " indirimli kampanya  eklenmiþtir!");
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanyamýz silinmiþtir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " isimli kampanyamýz güncellenmiþtir." ); 
	}

}
