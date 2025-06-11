package ch06.sec09;

public class CarExample {
	public static void main(String[] args) {
		// 포르쉐, 펜츠 차 2대 객체 생성
		Car benz = new Car("벤츠");
		Car porsche = new Car("포르쉐");

		porsche.run();
		benz.run();
	}
}
