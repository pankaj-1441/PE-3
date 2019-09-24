package co.exercise3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DatesOfWeek {
    public static void main(String []args)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("E dd/MM/Y");
        Date currentDate=new Date();
        Calendar cal=Calendar.getInstance();
        cal.setTime(currentDate);
        System.out.println("current date : "+sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_WEEK,cal.getFirstDayOfWeek()+1);
        System.out.println("First day of week: "+sdf.format(cal.getTime()));
        cal.add(Calendar.DAY_OF_WEEK,6);
        System.out.println("Last day of week: "+sdf.format(cal.getTime()));
    }
}


