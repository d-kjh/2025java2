package ch05.sec11;

public class Mission01Result {
    public static void main(String[] args) {
        // args이용하여 각 방에 있는 값들을 모두 더한 값을 출력
        // 향상된 for문
        int sum2 = 0;
        for (String item : args){
            sum2 += Integer.parseInt(item);
        }
        System.out.println("sum2 : " + sum2);

        int sum = 0;
        for (int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("sum : " + sum);
    }
}
