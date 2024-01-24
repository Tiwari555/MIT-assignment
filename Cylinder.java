
    import java.util.Random;

    public class Cylinder extends GeometricObject {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public double getArea() {
            // Lateral area of the cylinder + area of the two bases
            return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        }

        public double getVolume() {
            return Math.PI * radius * radius * height;
        }

        // Test method to generate a random Cylinder
        public static Cylinder getRandomCylinder() {
            Random rand = new Random();
            double radius = rand.nextDouble() * 10; // Adjust the range as needed
            double height = rand.nextDouble() * 10; // Adjust the range as needed
            return new Cylinder(radius, height);
        }
    }

