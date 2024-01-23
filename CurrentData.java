
    import java.util.GregorianCalendar;

    public class CurrentData {
        public static void main(String[] args) {
            // Create an instance of GregorianCalendar with the current date
            GregorianCalendar calendar = new GregorianCalendar();

            int year = calendar.get(GregorianCalendar.YEAR);
            int month = calendar.get(GregorianCalendar.MONTH) + 1; // adding 1 coz month is 0  based.
            int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

            System.out.println("Current Date:");
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        }
    }


