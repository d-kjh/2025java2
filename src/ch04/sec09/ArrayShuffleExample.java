package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10칸 짜리 정수 배열을 만들고 싶다.
        // 1~10까지 넣기
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        /*
        0~9랜덤값 구한다 . ex. 7나옴 0~7 스와핑한다.
        0~9랜덤값 구한다 . ex. 8나옴 1~8 스와핑한다.
        0~9랜덤값 구한다 . ex. 5나옴 2~5 스와핑한다.

         */
        for (int i = 0; i < arr.length; i++){
            int ran = (int)(Math.random() * 10);
            int temp = arr[ran];
            arr[ran] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
