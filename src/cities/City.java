package cities;

public class City {
	
	private Road[] roads; 
	
	private int numRoads;
	
	private String cityName;
	
	public City(String Name)
	{
		cityName = Name;
		
		numRoads = 0;
		
	}
	
	public void connect(Road r)
	{
		if(numRoads == 0)
		{
			roads = new Road[1];
			roads[numRoads] = r;
			numRoads++;
			
		}
		else
		{
			numRoads++;
			
			Road[] tempRoads = new Road[numRoads];
			
			for(int i = 0 ; i < numRoads-1; i++)
			{
				tempRoads[i] = roads[i];
			}
			
			roads = tempRoads;
			roads[numRoads-1] = r;
		}
	}
	
	public City nearestCity()
	{
		if(0 == numRoads)
		{
			return null;
		}
		else
		{
			//Find the nearest city
			Road tempRoad;
			
			tempRoad = roads[0];
			for (int i = 1; i < numRoads; i++)
			{
				if(roads[i].getLength() < tempRoad.getLength())
				{
					tempRoad = roads[i];
				}
			}
			
			if(this.toString() == tempRoad.getCity1().toString())
			{
				return tempRoad.getCity2();
			}
			else
			{
				return tempRoad.getCity1();
			}
			
		    
		}
	}
	
	public String toString()
	{
		return cityName;
	}

}
