package Tut4YolandePretorius;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalc{
    	
    	@Test
    	public void testAdd() {
    		assertEquals(10, Calc.add());
    	}
    	@Test
    	public void testSubtract() {
    		assertEquals(10, Calc.subtract());
    	}
    }
