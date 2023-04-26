public class Main {
    public enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void printDayGreeting(Day day)
    {
        if (day == Day.FRIDAY)
            System.out.println("YEAH, FRIIIDAYYY!");
        else
            System.out.println("Some other day :(");
    }

    public static void main(String[] args) {
        Day theDay = Day.THURSDAY;
        printDayGreeting(theDay);
    }
}