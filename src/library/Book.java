package library;

public class Book {
	
	private String bookName;
	
	private Author bookAuthor;
	
	public Book(String name, Author author)
	{
		bookName = name;
		
		bookAuthor = author;
	}
	
	public String getTitle()
	{
		return bookName;
	}
	
	public String getAuthorName()
	{
		return (bookAuthor.getName()); //+ "(" + bookAuthor.getBirthYear() + ")");
	}
	
	public int getAuthorBirthYear()
	{
		return (bookAuthor.getBirthYear());
	}
	
	public String toString()
	{
		return (bookName + " written by " + bookAuthor.getName() + "(" + bookAuthor.getBirthYear() + ")");
	}

}
