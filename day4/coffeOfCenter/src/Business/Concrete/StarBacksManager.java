package Business.Concrete;

import Business.Abstract.IMernisDataAdapterService;
import DataAccess.Concrete.BaseDatabaseManager;
import Entities.Concrete.Customer;

public class StarBacksManager extends BaseDatabaseManager{
	private IMernisDataAdapterService dataAdapterService;
	public StarBacksManager(IMernisDataAdapterService dataAdapterService) {
		this.dataAdapterService = dataAdapterService;
	}
	@Override
	public void save(Customer customer) {
		if(dataAdapterService.adap(customer)){
			super.save(customer);
		}else {
			System.out.println("This Is Person Not Real ");
		}
	}
}
