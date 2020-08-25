package Tut4YolandePretorius;


import static org.junit.Assert.*;


import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class TestCalc{
    	
    	@Test
    	public void testAdd() {
    		assertEquals(10, Calc.add());
    	}
    	@Test
    	public void testSubtract() {
    		assertEquals(5, Calc.subtract());
    	}
    }
