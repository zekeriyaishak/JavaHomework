package Homework4.Concrete;

import Homework4.Abstract.CustomerCheckService;
import Homework4.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService
{

	@Override
	public boolean CheckIfRealPerson(Customer customer) 
	{
		return true;
		
	}

}
