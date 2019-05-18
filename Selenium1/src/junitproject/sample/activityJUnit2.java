package junitproject.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class activityJUnit2 
{

	
	@BeforeClass
	public static void test1() 
	{
		//fail("Not yet implemented");
		Assert.assertTrue("Test Message pass", true);
		System.out.println("test1");
	}
	
	
	@Before
	public void test2() 
	{
		//fail("Not yet implemented");
		assertEquals("Test equal", "aaaa", "aaaa");
		System.out.println("test2");
	}

	@Test
	public void test3() 
	{
		String[] arr1 = {"aaaa", "aaaa"};
		String[] arr2 = {"aaaa", "aaaa"};
		assertArrayEquals(arr1, arr2);
		System.out.println("test3");

	}
	
	@After
	public void test4() 
	{
		//fail("Not yet implemented");
		Assert.assertTrue("Pass", true);
		System.out.println("test4");
	}
	
	@Test
	public void test5() 
	{
		//fail("Not yet implemented");
		assertEquals("Test equal", "kkkk", "kkkk");
		System.out.println("test5");
	}
	
	@AfterClass
	public static void test6() 
	{
		//fail("Not yet implemented");
		assertEquals("Test equal", "blabla", "blabla");
		System.out.println("test6");
	}
	
	

}
