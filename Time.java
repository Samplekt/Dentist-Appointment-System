public class Time
{
	private int hours;
	private int minutes;

	public Time()
	{
	System.out.println("Constructor requires argument for hours. For 12:00 - Time(12). For 12:30 Time(12,30).");
	}

	public Time(int h,int m)
	{
		if(h > 23)
			hours = 23;
		if(m > 59)
			minutes = 59;
		else{
			hours = h;
			minutes = m; }
	}

  public Time(int h)
  {	if(h > 23){
			hours = 23; }

    hours = h;
    minutes = 0;

  }

	public void display()
	{
		System.out.printf(hours+":%02d",minutes);
		System.out.println("");
	}

	public void addMinutes(int m)
	{
		int total = minutes + m;
		if(total > 59)
		 {
      while(total > 59){
		 	    total = total - 60;
          hours +=1;
					if(hours == 24)
						hours = 0;
      }
		 	minutes = total;
		 }
    else{
       minutes = total;
     }
	}

	public static void main(String[] args)
	{ Time [] tm = new Time[4];
		for (int i = 0; i < 4; i++){
			tm[i] = new Time((i+1),30);
			System.out.println("Time "+(i+1));
			System.out.println("Original:");
			tm[i].display();
			tm[i].addMinutes(((i+1)*11));
			System.out.println("Original + "+((i+1)*11)+" minutes:");
			tm[i].display();
			System.out.println("");

		}


	}
}
