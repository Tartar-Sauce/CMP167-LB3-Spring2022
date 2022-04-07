
public class Cat {
	private String furColor;
	private String eyeColor;
	private int age;
	
	public Cat ()
	{
		this.furColor = "Black";
		this.eyeColor = "Brown";
		this.age = 2;
	}
	
	public Cat (String furColor, String eyeColor, int age)
	{
		this.furColor = furColor;
		this.eyeColor = eyeColor;
		this.age = age;
	}
	
	//Setters
	public void setFurColor (String furColor)
	{
		this.furColor = furColor;
	}
	
	public void setEyeColor (String eyeColor)
	{
		this.eyeColor = eyeColor;
	}
	
	public void setAge (int age)
	{
		this.age = age;
	}
	
	//Getters
	public String getFurColor ()
	{
		return furColor;
	}
	
	public String getEyeColor ()
	{
		return eyeColor;
	}
	
	public int getAge ()
	{
		return age;
	}
	
	//Compare
	public Boolean Equals (Object O)
	{
		if (this == O)
		{
			return true;
		}
		
		if (O == null)
		{
			return false;
		}
		
		if (O instanceof Cat)
		{
			Cat otherCat = (Cat) O;
			return otherCat.furColor == this.furColor 
					&& otherCat.eyeColor == this.eyeColor 
					&& otherCat.age == this.age;
		}
		return false;
	}
	
	//To String
		public String toString ()
		{
			return "Cat:\nFur Color "+ this.furColor + 
					"\nCat's Eye Color "+ this.eyeColor 
					+"\nAge " + this.age;
		}
	
}
