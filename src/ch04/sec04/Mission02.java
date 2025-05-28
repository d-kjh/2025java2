package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // for문 활용하여 위처럼 출력되도록

        for (int i = 1; i < 11; i++){
            System.out.printf("%d%s", i, (i < 10 ? ", " : ""));
        }
    }
}
