public DentalAppointment
{
	public class Date
		{
	    private int month;
	    private int day;
	    private int year;

	    public Date()
    	{
	      month = 1;
	      day = 1;
	      year = 2000;
    	}

    	public Date(int m, int d, int y)
    	{
		      month = m;
		      day = d;
		      year = y;
    	}

   	 	public void display()
    	{
      		System.out.println("Date: "+month+"/"+day+"/"+year);
    	}

    	public static void main(String[] args)
    	{
		    Date def = new Date();
		    Date cstm = new Date(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));

		    System.out.println("Default Date:");
		    def.display();
		    System.out.println("Custom Date:");
		    cstm.display();

    	}
	}
}