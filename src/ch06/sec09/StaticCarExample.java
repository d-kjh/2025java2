package ch06.sec09;

public class StaticCarExample {
	public static void main(String[] args) {
		StaticCar.model = "벤틀리";
		StaticCar.setSpeed(200);
		StaticCar.run();
	}
}
