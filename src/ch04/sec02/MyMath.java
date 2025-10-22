package ch04.sec02;

public class MyMath {
    public static double pow(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
