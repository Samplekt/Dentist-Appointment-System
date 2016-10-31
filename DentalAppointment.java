import java.util.Scanner;
public class DentalAppointment
{
	public Date date ;
	public Person patient;
	public Time start_time;
	public Time end_time;
	public int duration;


	public DentalAppointment(String first, String last, int m, int d, int y, int hour, int minute)
	{
		patient = new Person(first,last);
		date = new Date(m,d,y);
		start_time = new Time(hour,minute);
		duration = 30;
		end_time = new Time(hour, minute);
		end_time.addMinutes(duration);
	}

	public DentalAppointment(String first, String last, int m, int d, int y, int hour, int minute, int dur)
	{
		if(dur > 240){
			System.out.println("Duration must be less than 240 minutes.");
		}
		else{
			patient = new Person(first,last);
			date = new Date(m,d,y);
			start_time = new Time(hour,minute);
			duration = dur;
			end_time = new Time(hour,minute);
			end_time.addMinutes(duration);
	}
}
	public void display()
	{
		System.out.println("");
		System.out.println("Appointment Details:");
		patient.display();
		System.out.print("Appointment Date: ");
		date.display();
		System.out.print("Start Time: ");
		start_time.display();
		System.out.print("End Time: ");
		end_time.display();
		System.out.println("");
	}



	public static void main(String[] args){
		for(int i = 0; i < 3; i++){
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter first name: ");
			String fname = sc.nextLine();

			System.out.print("Enter last name: ");
			String lname = sc.nextLine();

			System.out.println("Enter Appointment Date");
			System.out.print("Month: ");
			int month = sc.nextInt();
			sc.nextLine();

			System.out.print("Day: ");
			int day = sc.nextInt();
			sc.nextLine();

			System.out.print("Year: ");
			int year = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Appointment Time");
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			sc.nextLine();

			System.out.print("Minutes: ");
			int minutes = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Appointment Duration in Minutes(Less than 240): ");
			int dur = sc.nextInt();
			sc.nextLine();

			DentalAppointment app = new DentalAppointment(fname,lname,month,day,year,hour,minutes,dur);

			app.display();


		}
	}

}
