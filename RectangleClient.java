
    public class RectangleClient {
        public static void main(String[] args) {
            // Create two Rectangle objects
            Rectangle rectangle1 = new Rectangle(5, 50);
            Rectangle rectangle2 = new Rectangle(5, 50);

            // Assign color yellow to both rectangles
            Rectangle.setColor("Yellow");

            // Display properties of the first rectangle
            System.out.println("Rectangle 1 Properties:");
            System.out.println("Color: " + Rectangle.getColor());
            System.out.println("Width: " + rectangle1.getWidth());
            System.out.println("Height: " + rectangle1.getLength());
            System.out.println("Area: " + rectangle1.calculateArea());
            System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
            System.out.println();

            // Display properties of the second rectangle
            System.out.println("Rectangle 2 Properties:");
            System.out.println("Color: " + Rectangle.getColor());
            System.out.println("Width: " + rectangle2.getWidth());
            System.out.println("Height: " + rectangle2.getLength());
            System.out.println("Area: " + rectangle2.calculateArea());
            System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
        }
    }

