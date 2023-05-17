import java.util.Scanner;

public class UserInput {
    int age;
    int salary;
    String name;

    public static void main(String[] args) {
        UserInput user = new UserInput();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name , age and Salary");
        System.out.println("Enter User Name");
        user.name = scan.nextLine();
        System.out.println("Enter User Age");
        user.age = scan.nextInt();
        System.out.println("Enter User Salary");
        user.salary = scan.nextInt();
        scan.close();
        System.out.println("User Name " + user.name + " Age " + user.age + " Salary " + user.salary);

    }

}
