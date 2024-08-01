package TEST;
//import statements
import java.util.ArrayList;
import java.util.List;

public class SumEvenNumberinARRAY {
    public static void main(String[] args) {
    	//creating object
    	calculate c=new calculate();
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(35);
        numbers.add(42);
        numbers.add(35);
        numbers.add(34);

        // Calculate the sum of all even numbers
        int sum = c.calculateSumOfEvenNumbers(numbers);

        // Print the result
        System.out.println("Sum of even numbers: " + sum);
    }

    
}
class calculate
{
	public int calculateSumOfEvenNumbers(List<Integer> list) {
		//taking initial value of sum as o  
        int sum = 0;
        //using for loop 
        for (int number : list) {
        	// Check if the number is even
            if (number % 2 == 0) { 
            	
                sum += number;
            }
        }
        return sum;
    }
}