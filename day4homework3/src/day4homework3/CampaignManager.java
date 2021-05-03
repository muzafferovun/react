package day4homework3;

public class CampaignManager {
	public Campaign[] createCampaign(Campaign[] campaigns) {
		int i;
		for(i=0;i<campaigns.length;i++) {
			campaigns[i]=new Campaign(-1, "", 0);
		}
		return campaigns;
	}
	public boolean addCampaign(Campaign[] campaigns,String name, double discountRate,Logger[] loggers) {
		int i=0;
		int dataId=0;
		for(i=0;i<campaigns.length;i++) {
			if(campaigns[i].getId()==-1) {
				dataId=i;
				break;
			}
		}
		boolean checkRecord=true;
	
		String checkData="";
		if(name==""||name==null) { checkData=checkData+" Kampanya Ad�n� girmediniz";}
		if(checkData=="") {
			Campaign campaign=new Campaign(dataId,name,discountRate);
			campaigns[dataId]=campaign;
			Utils.RunLoggers(loggers,name+" "+name +" Kampanya Kaydedildi");
		}
		else {
			Utils.RunLoggers(loggers,name+" "+name+" Kampanya Kay�t hatalar�"+checkData);
			
		}
		
		return checkRecord;
		
	}
	public void listCampaigns(Campaign[] campaigns) {
		System.out.println("Kampanyalar :");

		for(Campaign campaign:campaigns) {
			if(campaign.getId()>-1) {
				System.out.println("      ->"+campaign.getName()+" ( %"+ campaign.getDiscountRate()+" �ndirim)");
			}
		}
	}
	public void updateCampaign(Campaign[] campaigns,int id,String name,double discountRate,Logger[] loggers) {
		String logMessage="";
		for(Campaign campaign:campaigns) {
			if(campaign.getId()==id) {
				campaign.setDiscountRate(discountRate);
				campaign.setName(name);
				logMessage=campaign.getId()+" id numaral� Kampanya ad� ' "+name+ " ', indirim Oran� '%"+discountRate+"' olarak G�ncellendi";
			}
		}
		Utils.RunLoggers(loggers,logMessage);

	}

}
