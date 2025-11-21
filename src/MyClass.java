public class MyClass {
    public static void main(String[] args){
        int num = 10;
        int newNum = myFunction(num);
        System.out.println(newNum);
    }
    private static int myFunction(int num){
        int result = num + num;
        return result;
    }
}
