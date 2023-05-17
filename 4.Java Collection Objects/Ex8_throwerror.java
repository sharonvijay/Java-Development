public class Ex8_throwerror {
    static void checkAge(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");

        } finally {
            System.out.println("The 'try catch' is finished.");
        }

    }

    public static void main(String[] args) {
        checkAge(50);
    }
}
