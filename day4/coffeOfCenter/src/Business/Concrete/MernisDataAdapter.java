package Business.Concrete;

import java.rmi.RemoteException;

import Business.Abstract.IMernisDataAdapterService;
import Entities.Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisDataAdapter implements IMernisDataAdapterService{
	@Override
	public boolean adap(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getCountryId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
