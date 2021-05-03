package day4homework3;

public class Game {
	private int id;
	private String name;
	private double gameCredit;
	 Game(int id, String name, double gameCredit) {
		super();
		this.id = id;
		this.name = name;
		this.gameCredit = gameCredit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGameCredit() {
		return gameCredit;
	}
	public void setGameCredit(double gameCredit) {
		this.gameCredit = gameCredit;
	}
	 
	
}
