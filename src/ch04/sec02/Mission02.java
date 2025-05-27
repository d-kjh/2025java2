package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    /*
    (점수를 입력받는다.)
    점수를 입력해 주세요 >

    100초과 혹은 0 미만이면 "잘못된 점수 입니다"
    90점 이상 "A"
    80점 이상 "B"
    70점 이상 "C"
    (나머지) "D"
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        String str = scanner.next();
        int score = Integer.parseInt(str);

        if (score > 100 || score < 0){
            System.out.println("점수없음");
        } else {
        switch ( score / 10 ) {
            case 10, 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;

            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }

        int temp = score/10;
        if (score > 100 || score <= 0 ) {
            System.out.println("잘못된 점수");
        }
        else{
            System.out.printf("%s", (temp>=9)? "A":  (temp==8)? "B":  (temp==7)? "C": "D" );
        }
    }
}
