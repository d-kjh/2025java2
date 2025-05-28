package ch04.sec04;

public class Mission05Result {
    public static void main(String[] args) {
        int[] arr = {10,70,90,110};
        // 배열의 모든 값을 더한 결과값을 출력
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        // 향상된 for문 : 배열 또는 컬렉션(리스트,세트 등),인덱스가 필요 없을 때
        int sum2 = 0;
        for (int i : arr) {
            sum2 += i;
        }
        System.out.println(sum2);
    }
}
