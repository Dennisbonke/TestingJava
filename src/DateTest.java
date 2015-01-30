import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 * Created by Dennisbonke on 29-1-2015.
 */
public class DateTest {

    public static String day;

    public static void main (String[] args) {

        checkDay();

    }

    public static void checkDay(){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        System.out.println("Day: " + dayNames[date.get(Calendar.DAY_OF_WEEK)]);

        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

        System.out.println(day);
        if (day == dayNames[date.get(Calendar.THURSDAY)]){
            System.out.println("Sabbar :(");
        }
    }

}
