package mm;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//proje üzerinde sað týklayýp  new->other->webservices->seb service client   = browse kýsmýna https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL  yazýn finish diyin
		//proje->properties ->java compiler-> vava versiyonu 1.8 seçiniz
		System.out.println(CheckTC.checkTC("tc","ad", "soyad",1982));
	}
}


