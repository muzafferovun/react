package day4homework3;

public class PlayerManager {
	public Player[] createPlayers(Player[] players) {
		int i;
		for(i=0;i<100;i++) {
			players[i]=new Player(-1,"","","","","","",0);
		}
		return players;
	}
	public void deletePlayer(Player[] players,int id,GameSales[] gameSales,Logger[] loggers) {
		int i;
		int playerId=-1;
		int gameSalesId=-1;
		for(i=0;i<players.length;i++) {
			if(players[i].getId()==id) {
				playerId=0;
				break;
			}	
		}
		if(playerId>-1) {
			
			
			for(i=playerId;i<players.length-1;i++) {
				players[i]=players[i+1];
			}
			Utils.RunLoggers(loggers,players[playerId].getName()+" "+players[playerId].getSurName()+" Kullanýcýsý Silindi");
			boolean playerKontrol=true;
			boolean playerSalesControl;
			int salesId=-1;
			while(playerKontrol==true) {
				playerSalesControl=false;
				for(i=0;i<gameSales.length;i++) {
					if(gameSales[i].getPlayer().getId()==playerId) {
						salesId=i;
						playerSalesControl=true;
						Utils.RunLoggers(loggers,players[playerId].getName()+" "+players[playerId].getSurName()+" Kullanýcýnýn "+gameSales[salesId]+" id numaralý Satýn alma iþlemi iptal edildi" );
						
						break;
					}
				}
				if(playerSalesControl==true) {
					for(i=salesId;i<gameSales.length-1;i++) {
						gameSales[i]=gameSales[i+1];
					}
				}
				if(playerSalesControl==false) playerKontrol=false;
			}
		}
	}
	
	
	private String checkNationalIdentity(String name, String surName,String nationalIdentity, int birthYear) {
		boolean checkData=true;
		String logdata="";
		if(name==""||name==null) {
			checkData=false;
			logdata=logdata+"[Name column is EMPTY]";
		}
		if(surName==""||name==null) {
			checkData=false;
			logdata=logdata+"[Surname column is EMPTY]";
		}
		
		if(nationalIdentity.length()!=11||nationalIdentity==null) {
			checkData=false;
			logdata=logdata+"[Hatalý Tc Kimlik Numarasý->"+nationalIdentity+"]";
		}
		
		
		return logdata;
	}
	public boolean addPlayers(Player[] players,String userName, String nickName, String password, String name, String surName,
			String nationalIdentity, int birthYear,Logger[] loggers) {
		int i=0;
		int playerId=0;
		for(i=0;i<players.length-1;i++) {
			if(players[i].getId()==-1) {
				playerId=i;
				break;
			}
		}
		boolean checkRecord=true;
	
		String checknationalIdentity=checkNationalIdentity(name,surName,nationalIdentity,birthYear);
		if(checknationalIdentity=="") {
			Player player=new Player(playerId,userName,nickName,password,name,surName,nationalIdentity,birthYear);
			players[playerId]=player;
			Utils.RunLoggers(loggers,name+" "+surName+" Kaydedildi");
		}
		else {
			Utils.RunLoggers(loggers,name+" "+surName+" Kayýt hatalarý"+checknationalIdentity);
			
		}
		
		return checkRecord;
		
	}
	public void listPlayers(Player[] players) {
		for(Player player:players) {
			if(player.getId()>-1) {
				System.out.println("Oyuncu :"+player.getId());
				System.out.println("      Ýsim :"+player.getName()+" "+player.getSurName());
				System.out.println("      Kredi :"+player.getCreditValue());
			}
		}
	}
	public void creditLoad(Player[] players,int id,double credit,Logger[] loggers) {
		String logMessage="Hatalý id namarasý("+id+") gönderildi";
		for(Player player:players) {
			if(player.getId()==id) {
				player.setCreditValue(player.getCreditValue()+credit);
				logMessage=player.getId()+" id numaralý kullanýcýya "+credit+ " kredi yüklendi yeni kredisi "+player.getCreditValue()+" oldu";
			}
		}
		Utils.RunLoggers(loggers,logMessage);

	}

}
