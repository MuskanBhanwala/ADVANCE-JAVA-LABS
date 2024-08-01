package TEST;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
    	//creating the object for the class 
    	Number printe = new Number();

        // Print odd numbers
        printe.printOddNumbers();

        // Print even numbers
        printe.printEvenNumbers();
    }
}
//using another class for method
class Number {
    public void printOddNumbers() {
        System.out.println("Odd Numbers: ");
        //using for-nested loop
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void printEvenNumbers() {
        System.out.println("Even Numbers: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
