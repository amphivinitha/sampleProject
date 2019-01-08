import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Event Details");
		System.out.println("Enter the Event Name");
		String name=br.readLine();
		System.out.println("Enter the Event Details");
		String detail=br.readLine();
		System.out.println("Enter the Event Type");
		String type=br.readLine();
		System.out.println("Enter the Organiser Name");
		String organiser=br.readLine();
		System.out.println("Enter the Attendees Count");
		Integer attendeesCount=Integer.parseInt(br.readLine());
		System.out.println("Enter the Projected Expense");
		Double projectedExpenses=Double.parseDouble(br.readLine());
		Event e=new Event(name,detail,type,organiser,attendeesCount,projectedExpenses);
		System.out.println("Enter the Hall Details");
		Hall hall = new Hall();
		System.out.println("Enter the Hall Name");
		hall.setName(br.readLine());
		System.out.println("Enter the contact details");
		hall.setContact(br.readLine());
		System.out.println("Enter the cost per day");
		hall.setCostPerDay(Double.parseDouble(br.readLine()));
		System.out.println("Enter the hall owner");
		hall.setOwner(br.readLine());
		HallBooking hallBooking = new HallBooking(hall, e);
		
		System.out.println(hallBooking);
	}
}