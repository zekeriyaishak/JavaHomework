package Abstract;

import Entities.Campaign;

public interface CampaingService {
	void addCampaign(Campaign campaign);
	void removeCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
}
