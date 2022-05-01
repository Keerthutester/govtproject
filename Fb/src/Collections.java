import java.util.List;
import java.util.ArrayList;

public class Collections {
	public static void main(String[] args) {
        // Creating list using the ArrayList class
        ArrayList numbers = new ArrayList();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add("help");
        numbers.add(5.2);
       


        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));

        
        
        System.out.println(numbers.contains(3));
        
        
        
        
        ArrayList<Integer> number = new ArrayList<Integer>();

        // Add elements to the list
        number.add(1);
        number.add(2);
        number.add(3);
        

        System.out.println(number);

}
}