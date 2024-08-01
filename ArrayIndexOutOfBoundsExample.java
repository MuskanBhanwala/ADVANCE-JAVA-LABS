package TEST;

public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        // Declare and initialize an array with 5 elements
        int[] numbers = {17,23,32};
        
        // Print the array to the console
        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // Attempt to access an element at an invalid index (out of bounds)
        try {
            // Accessing index 5 which is out of bounds for the array
            int value = numbers[10]; 
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and print an error message
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Continue with the rest of the program
        System.out.println("Program continues after exception handling.");
    }
}