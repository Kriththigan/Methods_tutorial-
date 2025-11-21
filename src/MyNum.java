public class MyNum {
    public static void main(String[] args){
        int a = 2;
        int b = 10;
        int newNum = myFunction(a, b);
        System.out.println(newNum);
    }
    private static int myFunction(int b, int a){
        int result = (a * 2) + b;
        return result;
    }
}
