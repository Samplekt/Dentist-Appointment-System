import java.util.Scanner;

public class Time
{
	private int hours;
	private int minutes;

	public Time()
	{
		hours = 0;
		minutes = 0;
	}

	public Time(int h,int m)
	{
		hours = h;
		minutes = m;
	}

	public void display()
	{
		System.out.println("Time: " + hours + ":" + minutes);
	}

	public int addMinutes(int h, int m, int addedmin)
	{
		int total = m + addedmin;
		if(total > 59)
		 {
		 	int result = total - 59;
		 	h += 1;
		 	m = result;
		 }
		return m;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to add minutes (yes or no)? ");
		String answer = sc.nextLine();
		//System.out.println("/" + answer);



		if (answer != "no")
			{
				System.out.print("How many minutes? ");
				int numofmin = sc.nextInt();
				m = addMinutes(hours,minutes,numofmin);
			}

	}
}