package Adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.IUserCheckService;

import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService {

	@Override
	public boolean isUserReal(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getTcKimlikNo()),
					user.getFirstName().toUpperCase(new Locale("tr")), user.getLastName().toUpperCase(new Locale("tr")),
					user.getDateOfBirth());
		} catch (RemoteException e) {
			System.out.println("tanýmsýz kullanýcý");
			e.getMessage();
		}
		return result;
	}

}
