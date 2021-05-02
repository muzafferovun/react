package day4homework3;

public class GameSalesManager {
	public GameSales[] createGameSales(GameSales[] gameSales) {
		int i;
		Game game=new Game(-1,"",0);
		Player player=new Player(-1,"", "","","","", "", 0);
		Campaign campaign=new Campaign(-1,"",0);

		for(i=0;i<gameSales.length;i++) {
			gameSales[i]=new GameSales(-1, game, player, campaign, 0);
		}
		return gameSales;
	}
	public boolean buyGame(GameSales[] gameSaless,Game game,Player player,Campaign campaign,Logger[] loggers) {
		int i=0;
		int dataId=0;
		for(i=0;i<gameSaless.length-1;i++) {
			if(gameSaless[i].getId()==-1) {
				dataId=i;
				break;
			}
		}
		boolean checkRecord=true;
	
		String checkData="";
		double gameCredit=game.getGameCredit();
		if(campaign!=null) {
			if(campaign.getDiscountRate()>0) gameCredit=gameCredit*(campaign.getDiscountRate()/100);
		}
		
		if(checkData=="") {
			GameSales GameSales=new GameSales(dataId, game, player, campaign,gameCredit);
			gameSaless[dataId]=GameSales;
			checkData=player.getNickName()+" Kullanýcýsýna "+game.getName()+" Oyunu"+gameCredit+"Krediye Satýldý.";
			if(campaign!=null) {
				if(campaign.getDiscountRate()>0) checkData=checkData+" "+campaign.getName()+" Kampanyasý ile %"+campaign.getDiscountRate()+" Uygulandý";
			}
			Utils.RunLoggers(loggers,checkData);
		}
		
		return checkRecord;
		
	}
	public void listGameSales(GameSales[] gameSaless) {
		System.out.println("Oyun Satýþlarý :");
		double discound=0;
		for(GameSales gameSales:gameSaless) {
			if(gameSales.getId()>-1) {
				if(gameSales.getGame().getGameCredit()>gameSales.getSalePrice()) discound=(gameSales.getSalePrice()/gameSales.getGame().getGameCredit())*100;
				System.out.println("      ->Oyun:"+gameSales.getGame().getName()+"  Oyuncu:"+gameSales.getPlayer().getNickName()+" Fiyat:"+gameSales.getSalePrice()+" Ýndirim:"+discound);
			}
		}
	}

}
