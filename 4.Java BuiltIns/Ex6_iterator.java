import java.util.Iterator;
import java.util.ArrayList;

public class Ex6_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        // System.out.println("Looping");
        // while (it.hasNext()) {
        // Integer i = it.next();
        // System.out.println(i);
        // }
        System.out.println("Removing");
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);

    }

}
