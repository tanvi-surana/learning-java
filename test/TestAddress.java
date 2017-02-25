package test;

import static org.junit.Assert.*;

import org.junit.Test;
import employee.Address;
public class TestAddress {

	@Test
	public void test() {
		Address a=new Address(123,"abcd","efg");
		//System.out.println("Before"+a.toString());
		assertTrue(123 == a.houseNo);
	}

}
