package TEST;
//importing Scanner class from java.util package
import java.util.Scanner;

public class StrongNumber 
{
    public static void main(String[] args) 
    
    {	//call the class that contains method
    	Strong Strong=new Strong();//creating object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check:");
        int number = sc.nextInt();  // Read input number

        // Check if number is a Strong number and print result
        if (Strong.isStrong(number)) 
        {
            System.out.println(number + " is a Strong number.");
        } else 
        {
            System.out.println(number + " is not a Strong number.");
        }

        sc.close();  // Close the scanner object
    }
}
class Strong
{
	// Method to calculate factorial of a number
     int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } else 
        {
            return n * factorial(n - 1);
        }
    }

    // Method to check if a number is a Strong number
    boolean isStrong(int num) 
    {
        int originalNum = num;
        int sum = 0;

        // Calculate sum of factorial of digits
        while (num > 0) 
        {
            int digit = num % 10;   // Extract the last digit
            sum += factorial(digit); // Add factorial of digit to sum
            num /= 10;  // Remove the last digit from number
        }

        // Check if sum of factorial equals the original number
        return sum == originalNum;
    }
}