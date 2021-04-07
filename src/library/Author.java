package library;

public class Author {
	
	private String authorName;
	private int yearOfBirth;
	
	public Author(String name, int yearOfbirth)
	{
		authorName  = name;
		
		yearOfBirth = yearOfbirth;
	}
	
	public String getName()
	{
		return authorName;
	}
	
	public int getBirthYear()
	{
		return yearOfBirth;
	}
	
	public int getAge(int currentYear)
	{
		return (currentYear - yearOfBirth);
	}
	
	public String toString()
	{
		return authorName + "(" + yearOfBirth + ")";
	}

}
