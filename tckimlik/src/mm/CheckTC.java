package mm;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckTC {
	public static boolean checkTC(String tC,String name,String surName,int year) {
		 KPSPublicSoap tc = new KPSPublicSoapProxy();
		  boolean deneme = false;
		  try {
		   deneme = tc.TCKimlikNoDogrula(Long.parseLong(tC), 
		     name, surName, year);
		  } catch (NumberFormatException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (RemoteException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		 return deneme;
		
	}
}
