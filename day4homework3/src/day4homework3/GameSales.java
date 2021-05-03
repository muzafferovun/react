package day4homework3;

public class GameSales {
	private int id;
	private Game game;
	private Player player;
	private Campaign campaign;
	private double salePrice;
	GameSales(int id, Game game, Player player, Campaign campaign, double salePrice) {
		super();
		this.id = id;
		this.game = game;
		this.player = player;
		this.campaign = campaign;
		this.salePrice = salePrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
}
