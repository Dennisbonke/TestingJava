import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 * Created by Dennisbonke on 29-1-2015.
 */
public class DateTest {

    public static String day;

    public static void main (String[] args) {



        checkDayForTeachers();

    }

    public static void checkDayForLessons(){

    }

    public static void checkDayForTeachers(){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        System.out.println("Day: " + dayNames[date.get(Calendar.DAY_OF_WEEK)]);

        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

        System.out.println(day);
        if (day == dayNames[Calendar.SUNDAY]){
            System.out.println("No Sabbar :)!");
            System.out.println("Weekend :)!");
        }
        else if (day == dayNames[Calendar.MONDAY]){
            System.out.println("Sabbar :(");
        }
        else if (day == dayNames[Calendar.TUESDAY]){
            System.out.println("Sabbar :(");
        }
        else if (day == dayNames[Calendar.WEDNESDAY]){
            System.out.println("No Sabbar :)!");
        }
        else if (day == dayNames[Calendar.THURSDAY]){
            System.out.println("Sabbar :(");
        }
        else if (day == dayNames[Calendar.FRIDAY]){
            System.out.println("No Sabbar :)!");
            System.out.println("Wiebols :(");
            System.out.println("Weekend :)!");
        }
        else if (day == dayNames[Calendar.SATURDAY]){
            System.out.println("No Sabbar :)!");
            System.out.println("Weekend :)!");
        }
    }

}
