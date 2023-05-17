public class Constructors_Java {
    int modelYear;
    String modelName;

    public Constructors_Java(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors_Java myCar = new Constructors_Java(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}