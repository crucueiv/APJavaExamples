package Calendar;

public class Event {
	private String person, place;
	
	public Event(String person, String place)
	{
		this.person = person;
		this.place = place;
	}
	
	public String getPerson()
	{
		return person;
	}
	
	public void setPerson(String person)
	{
		this.person = person;
	}
	
	public String getPlace()
	{
		return place;
	}
	
	public void setPlace(String place)
	{
		this.place = place;
	}
	
	@Override
	public String toString()
	{
		return ("(" + person + ", " + place + ")");
	}

}
