package ch06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		// 한 변의 길이가 40인 정사각형의 넓이를 구하고 싶음

		double result = cal.areaRectangle(40);

		// 가로 40 , 세로 50
		double result2 = cal.areaRectangle(40 ,50);

		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
	}
}
