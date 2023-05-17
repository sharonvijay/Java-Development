import java.util.HashMap;

public class Ex3_hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // HashMap Size
        capitalCities.size();

        // Loop Through
        System.out.println("Looping and Print Keys");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Loop Through
        System.out.println("Looping and Print values");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        System.out.println("Looping and Print Keys and values");

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // Access an Item
        capitalCities.get("England");

        // Remove an Item
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // To remove all
        capitalCities.clear();
        System.out.println(capitalCities);

    }
}
