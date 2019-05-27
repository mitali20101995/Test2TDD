import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TTC_Test {

	//Requirement 1
	@Test
	public void testOneWayTripZone1()
	{
		TTC t = new TTC();
		double expectedResult = 2.50;
		String[] arrayInputFrom = new String[] {"Leslie"};
		String[] arrayInputTo = new String[] {"Don Mills"};
		
		double actualResult = t.calculateTotal(arrayInputFrom, arrayInputTo);
		
		assertEquals(expectedResult,actualResult);
	}
	

}
