package day4homework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerManager loggerManager=new LoggerManager();
		
		Player[] players=new Player[100];
		PlayerManager playerManager=new PlayerManager();
		playerManager.createPlayers(players);
		playerManager.addPlayers(players, "proGamer", "Gamer99","1234","Ahmet", "Yýlmaz", "15487545521", 1988,loggerManager.log("Player","add") );
		playerManager.addPlayers(players, "Tsubasa", "tsubase23","42332","Cumali", "Aydýn", "HatalýTC", 2005,loggerManager.log("Player","add") );
		playerManager.addPlayers(players, "proGamer2", "2Gamer99","1234","Ahmet", "Yýlmaz", "54874521458", 1978,loggerManager.log("Player","add") );
		playerManager.addPlayers(players, "proGamer3", "3Gamer99","1234","Ali", "Bayram", "25417895458", 1983,loggerManager.log("Player","add") );
		playerManager.addPlayers(players, "proGamer4", "4Gamer99","1234","Veli", "Sýnmaz", "15487545521", 2002,loggerManager.log("Player","add") );
		playerManager.creditLoad(players, 1,154,loggerManager.log("Player","creditLoad"));
		playerManager.creditLoad(players, 2,15,loggerManager.log("Player","creditLoad"));
		playerManager.creditLoad(players, 40,86,loggerManager.log("Player","creditLoad"));
		playerManager.creditLoad(players, 3,90,loggerManager.log("Player","creditLoad"));
		playerManager.creditLoad(players, 0,15,loggerManager.log("Player","creditLoad"));
		playerManager.listPlayers(players);
		
		Game[] games=new Game[10];
		GameManager gameManager=new GameManager();
		gameManager.createGame(games);
		gameManager.addGame(games,"Age of Empires", 12,loggerManager.log("Game","add") );
		gameManager.addGame(games,"PES2020", 36,loggerManager.log("Game","add") );
		gameManager.addGame(games,"Fifa2021", 24,loggerManager.log("Game","add") );
		gameManager.listGames(games);
		gameManager.updateCredit(games, 1, 19,loggerManager.log("Game","update"));
		
		Campaign[] campaigns=new Campaign[10];
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.createCampaign(campaigns);
		campaignManager.addCampaign(campaigns, "1 Mayýs Özel Kampanyasý", 30, loggerManager.log("Campaign","add"));
		campaignManager.addCampaign(campaigns, "", 10, loggerManager.log("Campaign","add"));
		campaignManager.addCampaign(campaigns, "Ýlk Bahar Kampanyasý", 45, loggerManager.log("Campaign","add"));
		campaignManager.addCampaign(campaigns, "Haftasonu Kampanyasý", 20, loggerManager.log("Campaign","add"));
		campaignManager.listCampaigns(campaigns);
		campaignManager.updateCampaign(campaigns, 2, "Babar Günü Özel Kampanyasý", 65,loggerManager.log("Campaign","update"));
		campaignManager.listCampaigns(campaigns);

		GameSales[] gameSales=new GameSales[1000];
		GameSalesManager gameSalesManager=new GameSalesManager();
		gameSalesManager.createGameSales(gameSales);
		gameSalesManager.buyGame(gameSales,games[0],players[1],campaigns[0],loggerManager.log("GameSales","add"));
		gameSalesManager.buyGame(gameSales,games[1],players[1],campaigns[1],loggerManager.log("GameSales","add"));
		gameSalesManager.buyGame(gameSales,games[1],players[0],campaigns[1],loggerManager.log("GameSales","add"));
		gameSalesManager.buyGame(gameSales,games[2],players[0],campaigns[2],loggerManager.log("GameSales","add"));
		gameSalesManager.buyGame(gameSales,games[0],players[3],null,loggerManager.log("GameSales","add"));
		gameSalesManager.buyGame(gameSales,games[2],players[3],campaigns[0],loggerManager.log("GameSales","add"));
		
		playerManager.deletePlayer(players, 1, gameSales, loggerManager.log("Player","delete"));
		playerManager.listPlayers(players);
	}

}
