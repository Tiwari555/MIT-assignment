
    import java.util.Scanner;

    public class SumOfDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer between 0 and 1000: ");
            int number = scanner.nextInt();

            scanner.close();

            if (number < 0 || number > 1000) {
                System.out.println("Please enter  integer between 0 and 1000.");
            } else {
                int sum = 0;
                int tempNumber = number;

                while (tempNumber > 0) {
                    int digit = tempNumber % 10;
                    sum += digit;
                    tempNumber /= 10;
                }

                System.out.println("Digits sum " + number + ": " + sum);
            }
        }
    }



