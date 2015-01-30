import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 * Created by Dennisbonke on 29-1-2015.
 */
public class DateTest {

    public static String day;

    public static void main (String[] args) {

        //Intro to the program
        System.out.println("Welcome! " + "I will check the Day, Lessons and Teachers for you!");
        System.out.println("");
        //Checks the Day
        checkDay();
        System.out.println("");
        //TODO: Add checkDayForLessons when done
        //Checks the Teachers
        checkDayForTeachers();
        System.out.println("");
        System.out.println("Copyright: Dennis Bonke --2015");

    }

    public static void checkDay(){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

        System.out.println("Day: " + dayNames[date.get(Calendar.DAY_OF_WEEK)]);
        if (day == dayNames[Calendar.SUNDAY]){
            System.out.println("Weekend!");
        }
        else if (day == dayNames[Calendar.FRIDAY]){
            System.out.println("Weekend has started!");
        }
    }

    public static void checkDayForLessons(){
        //TODO Finish this thing up
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];
    }

    public static void checkDayForTeachers(){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();

        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

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
