package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체의 주소값을 저장할 수 있는 car 변수
        // = new라는 연산자를 통해 Car객체를 인스턴스화함(public Car(){}를 호출)
        Car car = new Car();

        System.out.println("모델명 : " + car.model);
        System.out.println("시동여부 : " + car.start);
        System.out.println("현재속도 : " + car.speed);
    }
}