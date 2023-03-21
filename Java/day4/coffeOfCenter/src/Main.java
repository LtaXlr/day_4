import Business.Concrete.DataAdaptor;
import Business.Concrete.MernisDataAdapter;
import Business.Concrete.StarBacksManager;
import DataAccess.Concrete.BaseDatabaseManager;
import Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("1","aptüllatif","sarıdağ",2009);
		BaseDatabaseManager databaseManager = new StarBacksManager(new DataAdaptor());
		databaseManager.save(customer);
	}

}
