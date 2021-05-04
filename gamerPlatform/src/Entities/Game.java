package Entities;

public class Game {
	private int id;
	private String gameName;
	private double price;
	private double priceAfterDiscount;
	public Game() {
		
	}
	public Game(int id, String gameName, double price,double priceAfterDiscount) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceAfterDiscount(Campaign campaign) {
		priceAfterDiscount = price - (price * campaign.getDisCount() / 100);
		return priceAfterDiscount ;
	}
}
