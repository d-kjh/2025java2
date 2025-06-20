package ch08.sec11.exam02;

public class Taxi implements Vehicle, Trunk{
	@Override
	public void run() {
		System.out.println("택시 달림");
	}

	@Override
	public void stop() {
		System.out.println("택시 멈춤");
	}

	@Override
	public void load(String luggage) {
		System.out.printf("택시 트렁크에 %s를 싣는다.\n", luggage);
	}
}
