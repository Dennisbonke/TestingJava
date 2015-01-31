import javax.swing.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Dennisbonke on 29-1-2015.
 */
public class DateTest {

    public static String day;
    private static Scanner input = new Scanner(System.in);
    private static Scanner GUIinput = new Scanner(System.in);
    private static String CMDanswer;
    private static String GUIchoice;

    public static void main (String[] args) {

        //Intro to the program
        System.out.println("Do you want a GUI? (WARNING: BUGGY!)");
        System.out.println("Type yes for a GUI, no for the commandline");
        GUIchoice = input.nextLine();
        if (GUIchoice.equalsIgnoreCase("yes")) {
            String GUIWelcome = "Welcome!" + "I will check the Day, Lessons and Teachers for you!";
            JOptionPane.showMessageDialog(null, GUIWelcome, "Welcome!", JOptionPane.OK_OPTION);
            System.exit(0);
        }
        else if (GUIchoice.equalsIgnoreCase("no")) {
            System.out.println("Welcome! " + "I will check the Day, Lessons and Teachers for you!");
            System.out.println("Do you want to know the day and info about it, the lessons for today or the teachers of today?");
            //Make Choice
            System.out.print("Please enter your choice, day for the day and info about it, lessons for the lessons and teachers for the teachers: ");
            CMDanswer = input.nextLine();
            //Execute choice
            if (CMDanswer.equals("day")) {
                checkDay();
            } else if (CMDanswer.equals("teachers")) {
                checkDayForTeachers();
            } else if (CMDanswer.equals("lessons")) {
                checkDayForLessons();
            } else {
                System.out.println(CMDanswer + " is not a valid answer");
            }

            //Checks the Day
            /*checkDay();
            System.out.println("");
            //TODO: Add checkDayForLessons when done
            //Checks the Teachers
            checkDayForTeachers();*/
            System.out.println("");
            System.out.println("Copyright: Dennis Bonke --2015");
        }
        else {
            System.out.println(GUIchoice + " is not vaild");
            System.out.println("Copyright: Dennis Bonke --2015");
        }
    }

    public static void checkDay(){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];
        System.out.println("");
        System.out.println("Day: " + dayNames[date.get(Calendar.DAY_OF_WEEK)]);

        if (day == dayNames[Calendar.SUNDAY]){
            System.out.println("");
            System.out.println("Weekend!");
        }
        else if (day == dayNames[Calendar.MONDAY]){
            System.out.println("");
            System.out.println("Weekend has ended :(");
        }
        else if (day == dayNames[Calendar.TUESDAY]){
            System.out.println("");
            System.out.println("So long to go till weekend...");
        }
        else if (day == dayNames[Calendar.WEDNESDAY]){
            System.out.println("");
            System.out.println("The longest day of the week...");
        }
        else if (day == dayNames[Calendar.THURSDAY]){
            System.out.println("");
            System.out.println("Nearly there!");
        }
        else if (day == dayNames[Calendar.FRIDAY]){
            System.out.println("");
            System.out.println("Weekend has started!");
        }
        else if (day == dayNames[Calendar.SATURDAY]){
            System.out.println("");
            System.out.println("Weekend!");
        }
    }

    public static void checkDayForLessons(){
        //TODO Finish this thing up
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

        if (day == dayNames[Calendar.SUNDAY]){
            System.out.println("");
            System.out.println("None!");
        }
    }

    public static void checkDayForTeachers(){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();

        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

        if (day == dayNames[Calendar.SUNDAY]){
            System.out.println("");
            System.out.println("No one");
        }
        else if (day == dayNames[Calendar.MONDAY]){
            System.out.println("");
            System.out.println("Sabbar :(");
        }
        else if (day == dayNames[Calendar.TUESDAY]){
            System.out.println("");
            System.out.println("Sabbar :(");
        }
        else if (day == dayNames[Calendar.WEDNESDAY]){
            System.out.println("");
            System.out.println("No Sabbar :)!");
        }
        else if (day == dayNames[Calendar.THURSDAY]){
            System.out.println("");
            System.out.println("Sabbar :(");
        }
        else if (day == dayNames[Calendar.FRIDAY]){
            System.out.println("");
            System.out.println("No Sabbar :)!");
            System.out.println("Wiebols :(");
        }
        else if (day == dayNames[Calendar.SATURDAY]){
            System.out.println("");
            System.out.println("No Sabbar :)!");
        }
    }

}
