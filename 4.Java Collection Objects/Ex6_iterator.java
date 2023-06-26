import java.util.Iterator;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex6_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        System.out.println("Looping");
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }

        // PRINT EVEN NUMBERS
        System.out.println("Printing Even Numbers");
        Consumer<Integer> method = n -> {
            if (n % 2 == 0)
                System.out.println(n);
        };

        numbers.forEach(method);

        System.out.println("Removing");
        it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);

    }

}
