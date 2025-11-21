public class NumRec {
    private static int sum(int num){
        if(num > 0){
            return num + sum(num-1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
        int number = 5;
        int result = sum(number);
        System.out.println("Sum of numbers from 1 to" + number + "is:" + result);
    }
}
