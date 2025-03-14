package Calendar;

public class Calendar {
	private Event events[];
	
	public Calendar()
	{
		events = new Event[24];
	}
	
	public void addEvent(int day, Event event)
	{
		if(day > 23 || day < 0)
		{
			throw new RuntimeException("Wrong time for an event");
		}
		events[day] = event;
	}
	
	public void deleteEvent(int day)
	{
		if(day > 23 || day < 0)
		{
			throw new RuntimeException("Wrong time for an event");
		}
		events[day] = null;
	}
	
	public Event editEvent(int day)
	{
		if(day > 23 || day < 0)
		{
			throw new RuntimeException("Wrong time for an event");
		}
		return events[day];
	}
	
	public String showEvent(int day)
	{
		if(day > 23 || day < 0)
		{
			throw new RuntimeException("Wrong time for an event");
		}
		return ("You have an event at " + events[day].getPlace() + " with " + events[day].getPerson());
	}
	
	@Override
	public String toString()
	{
		String r = "";
		for(int i = 0; i < events.length; i++)
		{
			if(events[i] != null)
			{
				r += "Day " + (i + 1) + ", " + events[i] + " ";
				if(i % 7 == 0)
				{
					r += '\n';
				}
			}

		}
		return r;
	}
}
