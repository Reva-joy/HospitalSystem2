public class ArithmeticDemo {
    public static void main(String[] args) {

        double num1 = 25.5;
        double num2 = 7.3;

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        int modulus = (int) num1 % (int) num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);
    }
}
