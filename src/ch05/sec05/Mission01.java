package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
        /*
        주민번호를 입력하시오. (xxxxxxx-xxxxxxx) >
        (만약) 주민등록번호길이가 다르면 "잘 못 입력하셨습니다."
        (길이가 맞다면) 8번째자리의 값으로 "여성", "남성" 출력해주세요.
        (8번째 자리가 1~4가 아니라면) "잘 못 입력하셨습니다."
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요. (xxxxxx-xxxxxxx) > ");
        String strNum = scanner.nextLine();

        if (strNum.length() != 14 || strNum.charAt(6) != '-'){
            System.out.println("잘못 입력");
        } else {
            switch (strNum.charAt(7)) {
                case '1', '3':
                    System.out.println("남");
                    break;
                case '2', '4':
                    System.out.println("녀");
                    break;
                default:
                    System.out.println("다시 입력");
                    break;
            }
        }

    }
}
