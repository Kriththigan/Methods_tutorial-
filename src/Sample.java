public class Sample {
    public void test(double a, double b){}
    public void test(int a, int b){}
    public void test(int c, double d){}
    public void test(double e, int f){}
    public static void main(String[] args){
        Sample m = new Sample();
        m.test(12.3, 12.2);
        m.test(12,12);
        m.test(12,12.2);
        m.test(12.3,12);
    }
}
