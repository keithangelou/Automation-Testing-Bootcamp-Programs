package junitproject.sample;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class acitivityJUnit1 {

	@Test
	public void test1() 
	{
		String[] arr1 = {"keith", "angelou"};
		String[] arr2 = {"aaa", "bbb"};
		assertArrayEquals(arr1, arr2);

	}

	@Test
	public void test2() 
	{
		//fail("Not yet implemented");
		assertEquals("Test equal", "keith", "keith");
		//System.out.println("They are equal");
	}

}
