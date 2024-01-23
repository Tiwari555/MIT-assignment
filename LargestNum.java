import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first  num");
        int num1= sc.nextInt();

        System.out.println("enter your second  num");
        int num2= sc.nextInt();

        System.out.println("enter your third  num");
        int num3= sc.nextInt();

        if(num1>num2) {
            if (num1>num3) {
                System.out.println("num1 is largest");
            } else {
                System.out.println("num3 is largest");

            }
        }
        else{
                if(num2>num3){
                    System.out.println("num2 is largest");
                }
            }
        }
    }

