package TEST;
//import statement
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Pineapple");
        stringList.add("Orange");
        stringList.add("Watermelon");
        stringList.add("Grapes");

        // Print the original list
        System.out.println("Original List:");
        for (String item : stringList) {
            System.out.println(item);
        }

        // Reverse the list using Collections.reverse()
        Collections.reverse(stringList);

        // Print the reversed list
        System.out.println("\nReversed List:");
        for (String item : stringList) {
            System.out.println(item);
        }
    }
}