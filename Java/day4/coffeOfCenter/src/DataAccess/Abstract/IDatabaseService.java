package DataAccess.Abstract;

import Entities.Concrete.Customer;

public interface IDatabaseService {
	void save(Customer customer);
}
