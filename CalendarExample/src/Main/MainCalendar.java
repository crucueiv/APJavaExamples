package Main;
import Calendar.Calendar;
import Calendar.Event;
public class MainCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar A = new Calendar();
		
		A.addEvent(0, new Event("Pacheco", "Centro"));
		
		System.out.println(A);
	}

}
