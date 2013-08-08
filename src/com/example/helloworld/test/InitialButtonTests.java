package com.example.helloworld.test;

import com.example.helloworld.HelloWorldActivity;
import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class InitialButtonTests extends
		ActivityInstrumentationTestCase2<HelloWorldActivity> {

	private Solo solo;

	
	@SuppressWarnings("deprecation")
	public InitialButtonTests() {
		super("com.example.helloWorld", HelloWorldActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	
	
	
	public void testAddRemove()
	{
		solo.assertCurrentActivity("Whoops there is a problem", HelloWorldActivity.class);
	}

}
