
    import java.util.Random;

    public class Square extends GeometricObject implements Colorable {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public void howToColor() {
            System.out.println("Color the square by filling it with your favorite color.");
        }

        // Test method to generate a random Square
        public static Square getRandomSquare() {
            Random rand = new Random();
            double side = rand.nextDouble() * 10; // Adjust the range as needed
            return new Square(side);
        }
    }


