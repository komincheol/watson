package com.n1books.pilot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.google.gson.Gson;

public class GSonTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	public void TestGSON() {
		Gson gson= new Gson();
		assertEquals("1", gson.toJson(1));
		assertEquals("abcd",gson.toJson("abcd"));
		assertEquals(10,gson.toJson(new Long(10)));
		int[] values= {1}; 
		assertEquals(1,gson.toJson(1));
		
	}

}
