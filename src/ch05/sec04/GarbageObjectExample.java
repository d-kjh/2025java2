package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";  // String 객체의 주소값이 hobby변수에 대입
        hobby = null; //  "여행"을 가지고 있는 String객체는 쓰레기로 만듦

        String kind1 = "자동차";
        String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대립
        kind1 = null; // "자동차"를 가지고 있는 String객체는 쓰레기가 아님

    }
}
