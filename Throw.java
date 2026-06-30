public class ThrowExample {

    static void checkAge(int age) {

        if (age < 18)
            throw new ArithmeticException("Not Eligible to Vote");

        System.out.println("Eligible to Vote");
    }

    public static void main(String[] args) {

        checkAge(15);
    }
}
