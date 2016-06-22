import static org.junit.Assert.*;

import org.junit.Test;

public class testDaysInMonth {

	@Test
	public void testDaysInJan() {
		assertTrue(DateUtility.getDaysInMonth(1, 2000)==31);
	}
	@Test
	public void testDaysInFebLeap() {
		assertTrue(DateUtility.getDaysInMonth(2, 2000)==29);
	}
	@Test
	public void testDaysInFebNoLeap() {
		assertTrue(DateUtility.getDaysInMonth(2, 2001)==28);
	}
	@Test
	public void testDaysInSept() {
		assertTrue(DateUtility.getDaysInMonth(9, 2000)==30);
	}
}
