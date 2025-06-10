package ch06.sec08.exam02;

public class Computer {
	public int sum(int... values){// ... : 가변 길이 매개변수
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		return sum;
	}
}
