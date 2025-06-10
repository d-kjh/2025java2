package ch06.sec08.exam01;

public class Calculator {
    // void 메소드
    public void powerOn(){
        System.out.println("전원 킴");
    }
    public void powerOff(){
        System.out.println("전원 끔");
    }
    // 리턴 메소드
    public int plus(int n1 , int n2) {
        int result = n1 + n2;
        return result;
    }
}
