package ch08.sec11.exam02;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스 달림");
	}
	
	@Override
	public void stop() {
		System.out.println("버스 멈춤");
	}
	
	public void openBackDoor() {
		System.out.println("뒷문 개방");
	}
}
