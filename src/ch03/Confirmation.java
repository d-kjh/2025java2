package ch03;

public class Confirmation {
    public static void main(String[] args) {
        // p.109 3번
        int pencils = 534;
        int students = 30;
        // 학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent); // 17
        // 남은 연필 수
        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft); // 24

        // 4번
        int value = 356;

        System.out.println((int)(value * 0.01) * 100 );
        System.out.println(value / 100 * 100);
        System.out.println(value - value % 100);

    }
}
