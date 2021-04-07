package library;

public class Library {
	
	private Book  libraryBooks[];
	
	public Library(int size)
	{
		libraryBooks = new Book[size];
	}
	
	public void setBook(int indx, String name, Author author)
	{
		libraryBooks[indx] = new Book(name, author);
	}
	
	public Book getBook(int indx)
	{
		return libraryBooks[indx];
	}

}
