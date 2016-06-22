import static org.junit.Assert.*;

import org.junit.Test;

public class testDayOfWeek {

	@Test
	public void testToday() {
		assertTrue(DateUtility.getDayOfWeek(6,22,2016)==4);
	}
	@Test
	public void testBirthday() {
		System.out.println(DateUtility.getDayOfWeek(9,30,1993));
		assertTrue(DateUtility.getDayOfWeek(9,30,1993)==5);
	}
}
