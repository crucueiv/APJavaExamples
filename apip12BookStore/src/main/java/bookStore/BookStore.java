package bookStore;

import java.util.ArrayList;

public class BookStore {
	private ArrayList<Book> books;
	
	public BookStore()
	{
		books = new ArrayList<>();
	}
	
	public void addBook(String author, String title, double basePrice)
	{
		addBook(new Book(author, title, basePrice));
	}
	
	private int seekBook(String author, String title)
	{
		int r = -1;

			for(int i = 0; i < books.size() && !books.get(i).getTitle().equalsIgnoreCase(title) && !books.get(i).getAuthor().equalsIgnoreCase(author); i++)
			{
				if(i + 1 < books.size() && books.get(i+1).getTitle().equalsIgnoreCase(title) && books.get(i).getAuthor().equalsIgnoreCase(author))
				{
					r = i + 1;
				}
			
		
			}
			
		return r;
	}
	
	public void deleteBook(String author, String title)
	{
		int i = seekBook(author, title);
		if(i == -1)
		{
			throw new RuntimeException("Book not found (" + author + ", " + title + ")");
		}
		books.remove(i);
		
	}
	
	public double getBasePrice(String author, String title)
	{
		int i = seekBook(author, title);
		if(i == -1)
		{
			throw new RuntimeException("Book not found (" + author + ", " + title + ")");
		}
		return books.get(i).getBasePrice();
	}
	
	public double getFinalPrice(String author, String title)
	{
		int i = seekBook(author, title);
		if(i == -1)
		{
			throw new RuntimeException("Book not found (" + author + ", " + title + ")");
		}
		return books.get(i).getFinalPrice();
	}
	
	@Override
	public String toString()
	{
		String r = "[";
		for(int i = 0; i < books.size(); i++)
		{
			r += books.get(i).toString();
			r += (i == books.size() - 1) ? "" : ", ";
		}
		r += "]";
		return r;
	}
	
	protected void addBook(Book book)
	{
		int i = seekBook(book.getAuthor(), book.getTitle());
		if(i == -1)
		{
			books.add(book);
		}
		else
		{
			books.remove(i);
			books.add(book);
		}
	}
	
	
}
