
public class TTC {
	
	public double calculateTotal(String[] from, String[] to)
	{
		String f = from[0];
		String t = to[0];
		double totalCost = 0.0;
		
		//Zone1
		if(f == "Leslie" && t == "Don Mills")
		{
			totalCost = 2.50;
		}
		
		else if(f == "Don Mills" && t == "Leslie")
		{
			totalCost = 2.50;
		}
		
		//Zone2
		else if(f == "Sheppard" && t == "Finch")
		{
			totalCost = 3.00;
		}
		
		else if(f == "Finch" && t == "Sheppard")
		{
			totalCost = 3.00;
		}
		
		//between zones
		else if((f == "Don Mills" || f == "Leslie") && (t == "Finch" || t == "Sheppard"))
		{
			totalCost = 3.00;
		}
		
		else if((t == "Don Mills" || t == "Leslie") && (f == "Finch" || f == "Sheppard"))
		{
			totalCost = 3.00;
		}
		
		return totalCost;
	}

}
