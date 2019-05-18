package junitproject.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTests 
{

	/*@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}*/

	@Test
	public void firsttest() 
	{
		//fail("Not yet implemented");
		Assert.assertTrue("Test Message failed", false);
		System.out.println("FAILED");

	}

	@Test
	public void secondtest() 
	{
		//fail("Not yet implemented");
		assertEquals("Test equal", "sas", "sas");
		System.out.println("They are equal");
	}

	@Test
	public void thirdtest() 
	{
		String[] arr1 = {"test", "han"};
		String[] arr2 = {"test", "ss"};
		assertArrayEquals(arr1, arr2);

	}

	@Test
	public void fourthtest() 
	{
		String[] arr1 = {"test", "han"};
		assertNull("not null po sya", arr1);
	}
	
	
}
