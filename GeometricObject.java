
    import java.util.Random;

    public abstract class GeometricObject implements Comparable<GeometricObject> {
        // Fields, constructors, and other methods...

        // Implementing compareTo method from Comparable interface
        @Override
        public int compareTo(GeometricObject o) {
            // Compare based on area
            double thisArea = this.getArea();
            double otherArea = o.getArea();

            if (thisArea < otherArea) {
                return -1; // Negative value if the current object is smaller
            } else if (thisArea > otherArea) {
                return 1; // Positive value if the current object is larger
            } else {
                return 0; // 0 if the areas are equal
            }
        }

        // Define the max method
        public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
            return (o1.compareTo(o2) > 0) ? o1 : o2;
        }

        // Abstract method(s) to be implemented by subclasses
        public abstract double getArea();
    }



