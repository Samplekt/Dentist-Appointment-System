public class Date{
    private int month;
    private int day;
    private int year;

    public Date(){
      month = 1;
      day = 1;
      year = 2000;
    }

    public Date(int m, int d, int y){
      month = m;
      day = d;
      year = y;
    }

    public void display(){
      System.out.println("Date: "+month+"/"+day+"/"+year);
    }

    public static void main(String[] args){
      Date def = new Date();
      Date cstm = new Date(10,24,2016);

      System.out.println("Default Date:");
      def.display();
      System.out.println("Custom Date:");
      cstm.display();

    }
}
