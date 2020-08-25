package Tut4YolandePretorius;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest{
    	
    	@Test
    	public void testNumberGenerator() {
    		assertEquals(42, new App().numberGenerator());
    	}
    	
    }
