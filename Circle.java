
    import java.util.Random;

    public class Circle extends GeometricObject {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Test method to generate a random Circle
        public static Circle getRandomCircle() {
            Random rand = new Random();
            double radius = rand.nextDouble() * 10; // Adjust the range as needed
            return new Circle(radius);
        }
    }

