package ch07.sec07.poly2;

// Computer는 Product를 상속 받는다.
// Computer의 가격은 200만원 이다 (무조건)
// Computer 객체의 주소값을 println에 찍으면 "Computer"가 출력되어야 한다
// > toString 메소드 오버라이딩
public class Computer extends Product {

    public Computer() {
        super(200);
    }
    @Override
    public String toString() {
        return "Computer";
    }
}
