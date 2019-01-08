import java.util.Date;
public class HallBooking {
    private Hall hall;
	private Event event;
	public HallBooking(){}
	public HallBooking(Hall hall, Event event) {
		this.hall = hall;
		this.event = event;
	}
	public Hall getHall() {
		return hall;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	
	public String toString()
	{
		return "Evnet Details\n"+this.event+"\nHall Details\n"+this.hall;
	}
}