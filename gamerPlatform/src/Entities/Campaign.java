package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private double disCount;
	private boolean isActive;
	
	public Campaign () {
		
	}
	
	public Campaign(int id, String campaignName, double disCount, boolean isActive) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.disCount = disCount;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDisCount() {
		return disCount;
	}

	public void setDisCount(double disCount) {
		this.disCount = disCount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
