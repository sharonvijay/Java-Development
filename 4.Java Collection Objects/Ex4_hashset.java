
// Import the HashSet class
import java.util.HashSet;

public class Ex4_hashset {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // HashSet Size
        cars.size();

        // Loop Through
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("Iterating HashSet using forEach method");
        cars.forEach(e -> System.out.println(e));

        // Check If an Item Exists
        cars.contains("Mazda");

        // Remove an Item
        cars.remove("Volvo");

    }
}