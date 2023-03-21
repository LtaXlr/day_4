package Business.Concrete;

import Business.Abstract.IMernisDataAdapterService;
import Entities.Concrete.Customer;

public class DataAdaptor implements IMernisDataAdapterService{
	@Override
	public boolean adap(Customer customer) {
		return true;
	}
	
}
