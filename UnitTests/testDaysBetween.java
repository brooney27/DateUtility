import static org.junit.Assert.*;

import org.junit.Test;

public class testDaysBetween {

	@Test
	public void test1Day() {
		assertTrue(DateUtility.daysBetween(1, 1, 2000,2,1,2000)==1);
	}
	@Test
	public void testSameDay() {
		assertTrue(DateUtility.daysBetween(1, 1, 2000,1,1,2000)==0);
	}
	@Test
	public void test1Year() {
		assertTrue(DateUtility.daysBetween(1, 1, 2001,1,1,2002)==365);
	}
}
