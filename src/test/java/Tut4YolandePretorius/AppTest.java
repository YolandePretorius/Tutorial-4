package Tut4YolandePretorius;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{
    	
    	@Test
    	public void testNumberGenerator() {
    		assertEquals(42, new App().numberGenerator());
    	}
    	
    }

