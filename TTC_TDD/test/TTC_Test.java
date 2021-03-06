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
	
	//Requirement 2
		@Test
		public void testOneWayTripZone2()
		{
			TTC emad = new TTC();
			double expectedResult = 3.00;
			String[] arrayInputFrom = new String[] {"Finch"};
			String[] arrayInputTo = new String[] {"Sheppard"};
			
			double actualResult = emad.calculateTotal(arrayInputFrom, arrayInputTo);
			
			assertEquals(expectedResult,actualResult);
		}
	
		//Requirement 3
				@Test
				public void testTripBetweenZones()
				{
					TTC emad = new TTC();
					double expectedResult = 3.00;
					String[] arrayInputFrom = new String[] {"Leslie"};
					String[] arrayInputTo = new String[] {"Finch"};
					
					double actualResult = emad.calculateTotal(arrayInputFrom, arrayInputTo);
					
					assertEquals(expectedResult,actualResult);
				}
				
				//Requirement 4
				@Test
				public void testMoreThan1Trip()
				{
					TTC emad = new TTC();
					double expectedResult = 5.50;
					String[] arrayInputFrom = new String[] {"Finch"};
					String[] arrayInputTo = new String[] {"Don Mills"};
					
					double actualResult = emad.calculateTotal(arrayInputFrom, arrayInputTo);
					
					assertEquals(expectedResult,actualResult);
				}	
	
	

}
