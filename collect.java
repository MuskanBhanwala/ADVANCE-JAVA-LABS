package TEST;


import java.util.ArrayList;
import java.util.List;

public class collect {
	public static void main(String[] args) {
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(5);
		ls.add(25);
		ls.add(83);
		ls.add(40);
		
		
		for (Integer i : ls) {
			System.out.print(i+"\t");
		}
	}
}