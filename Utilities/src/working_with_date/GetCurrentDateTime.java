
package working_with_date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class GetCurrentDateTime {
    public static void main(String[] args) {
        DateFormat dateFormat=new SimpleDateFormat("YYYY/MM/dd hh:mm:ss a");
        DateFormat dateFormat1=new SimpleDateFormat("YYYY/MM/dd");
        
        //get current date time with Date()
        Date date=new Date();
        System.out.println(date);
        System.out.println(dateFormat.format(date));
        
        //get current date time with calender()
        Calendar cal=Calendar.getInstance();
        String  st=cal.getTime().toString();
        System.out.println(st);
        System.out.println(dateFormat1.format(cal.getTime()));
        
    }
}
