public class Multi {


    private static void multiply_numbers_print(double x, double y) {
        System.out.println(x * y);
    }


    private static double multiply_numbers(double x, double y) {
        return x * y;
    }

    // Method for 3 numbers
    private static double multiply_numbers(double x, double y, double z) {
        return x * y * z;
    }

    public static void main(String[] args) {
        multiply_numbers_print(2, 3);           // prints 6.0
        double result2 = multiply_numbers(2, 3);
        System.out.println(result2);            // prints 6.0
        double result3 = multiply_numbers(2, 3, 4);
        System.out.println(result3);            // prints 24.0
    }
}
