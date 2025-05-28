package ch04.sec04;

public class Mission01 {
    public static void main(String[] args) {
        // 20 ~ 30까지 모두 더한 값을 출력해주세요.
        int sum = 0;
        for (int i = 20; i <=30; i++ ){
            sum += i;
        }
        System.out.println("20 ~ 30 더한 값 : " + sum);
    }
}
