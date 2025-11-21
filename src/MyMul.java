public class MyMul {
    public static void main (String[] args){
        double a = 2.5;
        double b = 1.5;
        double result = multiply_numbers(a,b);
    }
    private static int multiply_numbers(int x, int y){
        System.out.println("Method 1");
        return x * y;
    }
    private static double multiply_numbers(double x, double y){
        System.out.println("Method 2");
        return x * y;
    }
}
