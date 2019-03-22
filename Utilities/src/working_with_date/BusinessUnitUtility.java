
package working_with_date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class BusinessUnitUtility {
    public static Calendar getCalendarForNow() {
        Calendar calender=GregorianCalendar.getInstance();
        calender.setTime(new Date());
        return calender;
    }
   
}
