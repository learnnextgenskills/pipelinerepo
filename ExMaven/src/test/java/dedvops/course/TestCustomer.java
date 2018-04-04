package dedvops.course;

import static org.junit.Assert.*;

import org.junit.Test;

import devops.course.Customer;

public class TestCustomer {

	@Test
	public void test() {
		Customer c = new Customer(1, "Joe Smith");
		assertEquals(1L, c.getId());
	
	}
	
	
	
	

}
