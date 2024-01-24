
    public class ComparableCylinderTest {
        public static void main(String[] args) {
            ComparableCylinder cylinder1 = ComparableCylinder.getRandomComparableCylinder();
            ComparableCylinder cylinder2 = ComparableCylinder.getRandomComparableCylinder();

            ComparableCylinder largerCylinder = (ComparableCylinder) GeometricObject.max(cylinder1, cylinder2);

            // Display the result or perform further actions
            System.out.println("Cylinder 1 Volume: " + cylinder1.getVolume());
            System.out.println("Cylinder 2 Volume: " + cylinder2.getVolume());
            System.out.println("Larger Cylinder Volume: " + largerCylinder.getVolume());
        }
    }


