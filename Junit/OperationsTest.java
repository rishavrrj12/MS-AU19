package com.test.junit;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.Mockito;
public class OperationsTest {

	@Before
	public void beforeeach() {
		System.out.println("Before each Unit Test");
	}

	@After
	public void aftereach() {
		System.out.println("After each Unit Test");
	}

	@Test
	public void testSquare() {
		assertEquals(25, Operations.square(5));
	}

	@Test
	public void testMax() {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();


		int max1 = Operations.square(8);
		int max2 = Operations.square(-8);
		int max3 = Operations.square(2);
		int max4 = Operations.square(4);


		//		= Mockito.mock(Operations.class);

		int arr[] = {max1,max2,max3,max4};



		int expected = 64;

		assertEquals(-1, Operations.maxElement(arr));		
	}

	@BeforeClass
	public static void before()  {

		System.out.println("Executing Before Class");
	}

	@AfterClass
	public static void after() {

		System.out.println("Executing After Class");
	}
}
