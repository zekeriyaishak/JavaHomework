package Homework4;
import java.util.GregorianCalendar;
import Homework4.Abstract.BaseCustomerManager;
import Homework4.Adapters.MernisServiceAdapter;
import Homework4.Concrete.NeroCustomerManager;
import Homework4.Concrete.StarbucksCustomerManager;
import Homework4.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Zekeriya Ýshak");
		customer.setLastName("Doðanay");
		customer.setNationalityId("42379608852");
		customer.setDateOfBirth(new GregorianCalendar(2002, 03 , 28).getTime());
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		System.out.println();
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(customer);
		
	}
	
}
