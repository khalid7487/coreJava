
package working_with_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.w3c.dom.ranges.Range;


public class FirstLastDateFromDate {
    public static void main(String[] args) {
        //start date of the month
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date begining, ending;
        Calendar calendar_start=BusinessUnitUtility.getCalendarForNow();
        calendar_start.set(Calendar.DAY_OF_MONTH, calendar_start.getActualMinimum(Calendar.DAY_OF_MONTH));
        begining=calendar_start.getTime();
        
        String start = sdf.format(begining);
        System.out.println(start);
        
        //End date of the month
        Calendar calendar_end=BusinessUnitUtility.getCalendarForNow();
        calendar_end.set(Calendar.DAY_OF_MONTH, calendar_end.getActualMaximum(Calendar.DAY_OF_MONTH));
        ending=calendar_end.getTime();
        String end = sdf.format(ending);
        System.out.println(end);
        
    }
}
