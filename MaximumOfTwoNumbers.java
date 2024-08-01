package TEST;
//importing Scanner class from java.util package
import java.util.Scanner;

public class MaximumOfTwoNumbers {
	
    public static void main(String[] args) {
        // //let us first create the object of scanner class to read input from the user
        Scanner scanner = new Scanner(System.in);

        //  the user is asked to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); //value is stored in num1

        //the user is asked to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  //value is stored in num2

        // Close the Scanner object after reading input
        scanner.close();

        // Using ternary operator to find the maximum of the two numbers
        int max = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}