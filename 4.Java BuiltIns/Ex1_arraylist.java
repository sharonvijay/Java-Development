import java.util.ArrayList;
import java.util.Collections;

public class Ex1_arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        // Add Items

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // ArrayList Size
        cars.size();

        // Looping
        System.out.println("Looping");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Sorting
        Collections.sort(cars);
        System.out.println("Sorting");
        for (String i : cars) {
            System.out.println(i);
        }

        // Access an Item
        cars.get(0);

        // Change an Item
        cars.set(0, "Opel");

        // Remove an Item
        cars.remove(0);

        // To remove all
        cars.clear();

    }
}
