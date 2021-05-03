package day4homework3;

public class GameManager {
	public Game[] createGame(Game[] game) {
		int i;
		for(i=0;i<game.length;i++) {
			game[i]=new Game(-1,"",0);
		}
		return game;
	}
	public boolean addGame(Game[] games,String name, double gameCredit,Logger[] loggers) {
		int i=0;
		int gameId=0;
		for(i=0;i<games.length;i++) {
			if(games[i].getId()==-1) {
				gameId=i;
				break;
			}
		}
		boolean checkRecord=true;
	
		String checkGame="";
		if(name==""||name==null) { checkGame=checkGame+" Oyun Adýný girmediniz";}
		if(checkGame=="") {
			Game game=new Game(gameId,name,gameCredit);
			games[gameId]=game;
			Utils.RunLoggers(loggers,name+" "+name +" oyunu Kaydedildi");
		}
		else {
			Utils.RunLoggers(loggers,name+" "+name+" Kayýt hatalarý"+checkGame);
			
		}
		
		return checkRecord;
		
	}
	public void listGames(Game[] games) {
		System.out.println("Oyunlar :");

		for(Game game:games) {
			if(game.getId()>-1) {
				System.out.println("      ->"+game.getGameCredit()+" ( "+ game.getId()+" Kredi)");
			}
		}
	}
	public void updateCredit(Game[] games,int id,double credit,Logger[] loggers) {
		String logMessage="";
		for(Game game:games) {
			if(game.getId()==id) {
				game.setGameCredit(credit);
				logMessage=game.getId()+" id numaralý oyunun kredisi "+credit+ " olarak Güncellendi";
			}
		}
		Utils.RunLoggers(loggers,logMessage);

	}

}
