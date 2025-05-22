package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.printf("x : %d, y : %d\n", x, y);
        // 스와핑으로 처리
        int tmp = x;
        x = y;
        y = tmp;
        // x : 5, y : 3로 출력되도록
        System.out.printf("x : %d, y : %d\n", x, y);
    }
}
