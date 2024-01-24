import java.util.Random;

public class ComparableCylinder extends GeometricObject {
    private double radius;
    private double height;

    public ComparableCylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof ComparableCylinder) {
            ComparableCylinder other = (ComparableCylinder) o;
            // Compare cylinders based on volume
            double thisVolume = this.getVolume();
            double otherVolume = other.getVolume();

            if (thisVolume < otherVolume) {
                return -1; // Negative value if the current object is smaller
            } else if (thisVolume > otherVolume) {
                return 1; // Positive value if the current object is larger
            } else {
                return 0; // 0 if the volumes are equal
            }
        }
        return super.compareTo(o);
    }

    @Override
    public double getArea() {
        // Lateral area of the cylinder + area of the two bases
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Test method to generate a random ComparableCylinder
    public static ComparableCylinder getRandomComparableCylinder() {
        Random rand = new Random();
        double radius = rand.nextDouble() * 10; // Adjust the range as needed
        double height = rand.nextDouble() * 10; // Adjust the range as needed
        return new ComparableCylinder(radius, height);
    }
}

