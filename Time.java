
    import java.util.TimeZone;

    public class Time {
        private int hour, minute, second;

        public Time() {
            long currentTimeMillis = System.currentTimeMillis();
            setTime(currentTimeMillis);
        }

        public Time(long elapsedTime) {
            setTime(elapsedTime);
        }

        private void setTime(long elapsedTime) {
            long totalSeconds = elapsedTime / 1000;
            second = (int) (totalSeconds % 60);
            long totalMinutes = totalSeconds / 60;
            minute = (int) (totalMinutes % 60);
            long totalHours = totalMinutes / 60;
            hour = (int) (totalHours % 24);
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public static void main(String[] args) {
            Time currentTime = new Time();
            System.out.println("Current Time (GMT):");
            System.out.println("Hour: " + currentTime.getHour());
            System.out.println("Minute: " + currentTime.getMinute());
            System.out.println("Second: " + currentTime.getSecond());
        }
    }



