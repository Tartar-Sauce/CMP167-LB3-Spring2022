
public class House {
	private int numWindows;
	private String colors;
	private int numDoors;
	private int numRooms;
	private double cost;
	
	public House()
	{
		this.numWindows = 1;
		this.colors = "blue";
		this.numDoors = 1;
		this.numRooms = 2;
		this.cost = 250000.00;
		return;
	}

	public House (int numWindows, String colors, int numDoors, int numRooms, double cost)
	{
		this.numWindows = numWindows;
		this.colors = colors;
		this.numDoors = numDoors;
		this.numRooms = numRooms;
		this.cost = cost;
	}
	
	//Setters
	public void setNumWindows (int numWindows)
	{
		this.numWindows = numWindows;
	}
	public void setColor (String colors)
	{
		this.colors = colors;
	}
	
	//New setter for numDoors, numRooms, cost
	public void setnumDoors (int numDoors)
	{
		this.numDoors = numDoors;
	}
	public void setnumRooms (int numRooms)
	{
		this.numRooms = numRooms;
	}
	public void setCost (int cost)
	{
		this.cost = cost;
	}
	
	//Getters
	public int getNumWindows ()
	{
		return numWindows;
	}
	public String getColors ()
	{
		return colors;
	}
}
