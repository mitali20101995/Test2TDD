import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TTC_Test {

	//Requirement 1
	@Test
	public void testOneWayTripZone1()
	{
		TTC emad = new TTC();
		double expectedResult = 2.50;
		String[] arrayInputFrom = new String[] {"Don Mills"};
		String[] arrayInputTo = new String[] {"Leslie"};
		
		double actualResult = emad.calculateTotal(arrayInputFrom, arrayInputTo);
		
		assertEquals(expectedResult,actualResult);
	}
	

}
