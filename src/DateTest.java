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
    private static String GUIchoice;
    private static String GUIMessageWelcome = "Welcome!" +" " + "I will check the Day, Lessons and Teachers for you!";
    private static String GUIMessageChoice = "Please enter your choice, day for the day and info about it, lessons for the lessons and teachers for the teachers: ";
    private static String CMDanswer;

    public static void main (String[] args) {

        //Intro to the program
        System.out.println("Do you want a GUI? (WARNING: BUGGY!)");
        System.out.println("Type yes for a GUI, no for the commandline");
        GUIchoice = input.nextLine();
        if (GUIchoice.equalsIgnoreCase("yes")) {
            //Intro GUI Program
            JOptionPane.showMessageDialog(null, GUIMessageWelcome, "Welcome!", JOptionPane.INFORMATION_MESSAGE);
            //Make Choice
            JOptionPane.showInputDialog(null, GUIMessageChoice, "Question", JOptionPane.QUESTION_MESSAGE);
            System.exit(0);
        }
        else if (GUIchoice.equalsIgnoreCase("no")) {
            //Intro CMD Program
            System.out.println("Welcome! " + "I will check the Day, Lessons and Teachers for you!");
            //System.out.println("Do you want to know the day and info about it, the lessons for today or the teachers of today?");
            //Make Choice
            System.out.print("Please enter your choice, day for the day and info about it, lessons for the lessons and teachers for the teachers: ");
            CMDanswer = input.nextLine();
            //Execute choice
            if (CMDanswer.equals("day")) {
                checkDayCMD();
            } else if (CMDanswer.equals("teachers")) {
                checkDayForTeachersCMD();
            } else if (CMDanswer.equals("lessons")) {
                checkDayForLessonsCMD();
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
            System.out.println(GUIchoice + " is not a valid choice!");
            System.out.println("Copyright: Dennis Bonke --2015");
        }
    }

    public static void checkDayCMD(){
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
        else {
            System.out.println("No message for this day (yet)!" + " " + "Either you are using an outdated version, or you are testing, or the universe is messed up and we all gonna die");
        }
    }

    public static void checkDayForLessonsCMD(){
        //TODO Finish this thing up
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        day = dayNames[date.get(Calendar.DAY_OF_WEEK)];

        if (day == dayNames[Calendar.SUNDAY]){
            System.out.println("");
            System.out.println("None!");
        }
        else {
            System.out.println("No message for this day (yet)!" + " " + "Either you are using an outdated version, or you are testing, or the universe is messed up and we all gonna die");
        }
    }

    public static void checkDayForTeachersCMD(){
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
        else {
            System.out.println("No message for this day (yet)!" + " " + "Either you are using an outdated version, or you are testing, or the universe is messed up and we all gonna die");
        }
    }

}
