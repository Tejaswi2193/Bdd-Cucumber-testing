package com.wcs.mt.loginpage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks 
{
	@Before
	public void beforemethod()
	{
		System.out.println("before cucumber method");
	}
		@After
		public void aftermethod()
		{
			System.out.println("after cucumber method");
		}
}
