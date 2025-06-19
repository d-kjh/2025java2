package ch08.sec11.exam02;

public class Taxi implements Vehicle, Trunk{
	@Override
	public void run() {
		System.out.println("달림");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}

	@Override
	public void load(String str) {

	}
}
