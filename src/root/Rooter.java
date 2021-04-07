package root;


public class Rooter {
      
	private double rooterPrecision;
	
	public Rooter(double precision)
	{
		rooterPrecision = precision;
	}
	
	public void setPrecision(double precision)
	{
		rooterPrecision = precision;
	}
	
	public double sqrt(double x)
	{
		double ans = 0;
		
		double first, second;
		
		first = x/2;
		
		while(first > 0)
		{
		
			second = x/first;
			
			if (second == first)
			{
				ans = first;
				break;
			}
			else if (Math.abs(first - second ) < rooterPrecision)
			{
				ans = first;
				break;
			}
			
			first = (first + second) / 2;
		}
		
		return ans;
	}
}
