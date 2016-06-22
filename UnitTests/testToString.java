import static org.junit.Assert.*;

import org.junit.Test;

public class testToString {

	@Test
	public void testJan1() {
		assertTrue(DateUtility.toString(1,1,2000,'/').equals("1/1/2000"));
	}
	@Test
	public void testJan1Dash() {
		assertTrue(DateUtility.toString(1,1,2000,'-').equals("1-1-2000"));
	}
	@Test
	public void testDec31() {
		assertTrue(DateUtility.toString(12,31,2000,'/').equals("12/31/2000"));
	}
}
