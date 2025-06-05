package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star : " + star);
        printSingleLine(star); // 5면 -> ***** 개행
        System.out.println("---------------------------");
        printMultiLine(5);
        System.out.println("---------------------------");
        printTriangleLine(4);
    }

    public static void printSingleLine(int star){
        for (int i = 0; i < star; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printMultiLine(int num){
        for (int i = 0; i < num; i++){
            printSingleLine(num);
        }
    }
    public static void printTriangleLine(int cnt) {
        for (int i = 1; i<=cnt; i++) {
            printSingleLine(i);
        }
        System.out.println();
    }
}
