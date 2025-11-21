public class MethodsArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        add_1(array);

        for (int value : array) {
            System.out.println(value);
        }
    }

    private static void add_1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
}
