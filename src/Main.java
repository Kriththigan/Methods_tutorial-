public class Main {
    public static void printNum(int start, int end){
        for(int i=start; i<end; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        printNum(0,10);
        printNum(20,30);
        printNum(40,50);
    }
}