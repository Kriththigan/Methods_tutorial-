public class Cube {
    public static void main(String[] args) {
        double sideLength = 10;
        double result = cubeVolume(sideLength);
        System.out.println(result);
    }

    public static double cubeVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }
}
