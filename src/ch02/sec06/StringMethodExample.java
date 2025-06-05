package ch02.sec06;

public class StringMethodExample {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = new String("안녕");
        printCompareSting(str1, str2); // 두 문자열은 동일. 두 문자열은 동등. 두 문자열은 동등 x
    }
    public static void printCompareSting(String first, String second){
        if (first == second) {
            System.out.println("두 문자열은 동일");
        } else if (first.equals(second)) {
            System.out.println("두 문자열은 동등");
        } else {
            System.out.println("다 틀림");
        }
        System.out.println((first == second) ? "동일" :
                (first.equals(second) ? "동등" : "다 아님"));
    }
}

