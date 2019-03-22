
package working_with_date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        //create an instance of simpleDateFormat used for formatting
        //the string representation of date (month/day/year)
        DateFormat df=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
        
        //Get the date today using calender object.
        Date today=Calendar.getInstance().getTime();
        //using DateFormat format  method we can create a string
        //representation of a date with the defined format.
        String reportDate=df.format(today);
        //print what date is today!
        System.out.println("Current Date: "+reportDate);
    }
}
