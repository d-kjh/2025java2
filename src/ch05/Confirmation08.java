package ch05;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] arr = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };
        // 중첩 for문 사용 합계, 평균
        int sum = 0;
        int sum2 = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i].length;
            for (int k = 0; k < arr[i].length; k++) {
                sum += arr[i][k];
            }
        }
        // 향상된 for문
        for (int[] ints : arr) {
            cnt += ints.length;
            for (int anInt : ints) {
                sum2 += anInt;
            }
        }
        System.out.println(sum);
        System.out.println((double)sum / cnt);

        System.out.println(sum2);
        System.out.println((double)sum2 / cnt);
    }
}
