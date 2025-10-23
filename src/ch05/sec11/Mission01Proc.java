package ch05.sec11;

import java.util.Scanner;

public class Mission01Proc {
    public static void main(String[] args) {
        final String WEIGHT_UNIT = "kg";
        final String HEIGHT_UNIT = "cm";
        // arguments: 75kg 180cm
        // bmi 계산
        String kg = args[0].toLowerCase();
        String cm = args[1].toLowerCase();

        if (!cm.contains(HEIGHT_UNIT)) {
            System.out.println("cm(CM)까지 정확히 입력해주세요");
            return;
        } else if (!kg.contains(WEIGHT_UNIT)) {
            System.out.println("kg(KG)까지 정확히 입력해주세요");
            return;
        }
        double height = Double.parseDouble(cm.replace(HEIGHT_UNIT, ""));
        double weight = Double.parseDouble(kg.replace(WEIGHT_UNIT, ""));
        double mHeight = height * 0.01;

        double BMI = weight / Math.pow(mHeight, 2);
        System.out.printf("당신의 BMI는 %.2f 입니다", BMI);
    }
}
