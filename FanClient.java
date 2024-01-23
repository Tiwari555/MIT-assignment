
    public class FanClient {
        public static void main(String[] args) {
            // Create a Fan object
            Fan myFan = new Fan();

            // Set properties for the fan
            myFan.setSpeed(Fan.FAST); // Assign maximum speed
            myFan.setRadius(10.0);     // Set radius to 10
            myFan.setColor("yellow");  // Set color to yellow
            myFan.setOn(true);         // Turn the fan on

            // Display the fan object using toString
            System.out.println("Fan Properties:");
            System.out.println(myFan);
        }
    }

