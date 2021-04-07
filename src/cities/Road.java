package cities;

public class Road {
    
	City city1; 
	
	City city2; 
	
	int roadLength;
	
	public Road(City city1, City city2, int length)
	{
		this.city1 = city1;
		
		this.city2 = city2;
		
		this.roadLength = length;
		
		addRoadToCities(this);
	}
	
	private void addRoadToCities(Road r)
	{
		this.city1.connect(this);
		this.city2.connect(this);
	}
	
	public City getCity1()
	{
		return city1;
	}
	
	public City getCity2()
	{
		return city2;
	}
	
	
	public int getLength()
	{
		return roadLength;
	}
	
}
