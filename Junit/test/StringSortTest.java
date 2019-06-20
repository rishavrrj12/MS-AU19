package com.test.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringSortTest {

	@Before
	public void beforeeach() {
		System.out.println("Before each Unit Test");
	}

	@After
	public void aftereach() {
		System.out.println("After each Unit Test");
	}
	@BeforeClass
	public static void before()  {

		System.out.println("Executing Before Class");
	}

	@AfterClass
	public static void after() {

		System.out.println("Executing After Class");
	}
	
	
	@Test
	public void testSortSTring() {
		
		String inp[]= {"Rahul","Sachin","Virat","Rahul","Virat"};
		List<String> expected= Arrays.asList("Rahul", "Virat","Sachin");
		
		assertEquals(expected, StringSort.sortString(inp));
	}

}
