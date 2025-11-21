public class MethodScope {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            int square = i * i;
            sum = sum + square;
        }
        System.out.println(sum);
    }
}
