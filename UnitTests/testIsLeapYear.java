import static org.junit.Assert.*;

import org.junit.Test;

public class testIsLeapYear {

	@Test
	public void testLeapYear2000() {
		assertTrue(DateUtility.isLeapYear(2000));
	}
	@Test
	public void testLeapYear1900() {
		assertTrue(!DateUtility.isLeapYear(1900));
	}
	@Test
	public void testLeapYear2001() {
		assertTrue(!DateUtility.isLeapYear(2001));
	}
	@Test
	public void testLeapYear2004() {
		assertTrue(DateUtility.isLeapYear(2004));
	}
}
