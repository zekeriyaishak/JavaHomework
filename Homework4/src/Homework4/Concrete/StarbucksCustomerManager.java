package Homework4.Concrete;

import Homework4.Abstract.BaseCustomerManager;
import Homework4.Abstract.CustomerCheckService;
import Homework4.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
            throw new ArithmeticException("Not a valid person.");
        }
	}
	
	
	
	
	
	
}
