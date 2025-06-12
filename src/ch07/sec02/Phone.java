package ch07.sec02;

public class Phone {
	private String model;
	private String color;

	public Phone(String model, String color) {
		System.out.println("Phone 생성자 호출 !");
		this.model = model;
		this.color = color;
	}
	// model getter
	public String getModel(){
		return this.model;
	}
	// color getter
	public String getColor(){
		return this.color;
	}

	public void bell() {
		System.out.println("징글벨");
	}
	public void sendSms(String message){
		System.out.println("본인: " + message);
	}
	public void receiveSms(String message){
		System.out.println("상대: " + message);
	}
	public void hangUp(){
		System.out.println("종료");
	}
}
