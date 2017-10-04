package com.programs;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Alltestngmethods {
		@Test
		 
		public void testCase1() {

			System.out.println("This is the Test Case 1");

		}

		@Test

		public void testCase2() {

			System.out.println("This is the Test Case 2");

		}

		@BeforeMethod

		public void beforeMethod() {

			System.out.println("This will execute before every Method 1");

		}

		@AfterMethod

		public void afterMethod() {

			System.out.println("This will execute after every Method 2");

		}

		@BeforeClass

		public void beforeClass() {

			System.out.println("This will execute before the Class");

		}

		@AfterClass

		public void afterClass() {

			System.out.println("This will execute after the Class");

		}

		@BeforeTest

		public void beforeTest() {

			System.out.println("This will execute before the Test");

		}

		@AfterTest

		public void afterTest() {

			System.out.println("This will execute after the Test");

		}

	

	}



