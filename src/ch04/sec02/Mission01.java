package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    /*
    (커맨드창으로 값을 입력 받을 것)

    점수를 입력해주세요 >

    점수가 60점 이상이면 "합격입니다"
    아니면 불합격
    출력
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 > ");
        String str = scanner.next();
        int score = Integer.parseInt(str);

        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합");
        }
    }
}
