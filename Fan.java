
    public class Fan {
        // Constants for fan speeds
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        // Instance variables
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // Constructors
        public Fan() {
            // Default values
            this.speed = SLOW;
            this.on = false;
            this.radius = 5.0;
            this.color = "blue";
        }

        // Accessor and mutator methods for speed
        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            if (speed >= SLOW && speed <= FAST) {
                this.speed = speed;
            } else {
                System.out.println("Invalid speed. Setting speed to SLOW.");
                this.speed = SLOW;
            }
        }

        // Accessor and mutator methods for on
        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        // Accessor and mutator methods for radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Accessor and mutator methods for color
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // toString method to display all properties
        @Override
        public String toString() {
            return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
        }
    }

