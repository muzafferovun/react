package mm;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//proje �zerinde sa� t�klay�p  new->other->webservices->seb service client   = browse k�sm�na https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL  yaz�n finish diyin
		//proje->properties ->java compiler-> vava versiyonu 1.8 se�iniz
		System.out.println(CheckTC.checkTC("tc","ad", "soyad",1982));
	}
}


