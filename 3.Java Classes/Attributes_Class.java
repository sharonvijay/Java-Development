public class Attributes_Class {
    int x = 5;

    public static void main(String[] args) {
        Attributes_Class myObj1 = new Attributes_Class();
        Attributes_Class myObj2 = new Attributes_Class();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
