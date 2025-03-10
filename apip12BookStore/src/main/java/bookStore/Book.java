package bookStore;

public class Book {
	private static double percVAT = 10.0;
	private String author;
	private String title;
	private double basePrice;
	
	public Book(String author, String title, double basePrice)
	{
		this.author = author;
		this.title = title;
		this.basePrice = basePrice;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public double getBasePrice()
	{
		return basePrice;
	}
	
	protected double getTaxBasePrice()
	{
		return basePrice;
	}
	
	public double getFinalPrice()
	{
		return basePrice + (getTaxBasePrice() * (percVAT/100));
	}
	
	@Override
	public String toString()
	{
		return ("(" + author + "; " + title + "; " + basePrice + "; " + percVAT + "; " + getFinalPrice() + ")");
	}
	
	
	private double getVAT()
	{
		return percVAT; 
	}
	
	public static void setVAT(double VAT)
	{
		percVAT = VAT;
	}
}
