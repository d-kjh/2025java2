package ch04.sec04;

import java.util.Arrays;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = {90, 88, 100, 70, 60};
        // 내가 받은 점수 평균점수를 구하라.
        System.out.println("평균 : " + (double) Arrays.stream(scores).sum()/scores.length);

        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("avg : " + (double)sum / scores.length);

        int sum2 = 0;
        for (int item : scores){
            sum2 += item;
        }
        System.out.println("평균점수 : " + (double)sum2 / scores.length);
    }
}
