package DataAccess.Concrete;

import DataAccess.Abstract.IDatabaseService;
import Entities.Concrete.Customer;

public abstract class BaseDatabaseManager implements IDatabaseService{

	@Override
	public void save(Customer customer) {
		System.out.println("save to Database : "+customer.getFirstName());
	}
	
}
